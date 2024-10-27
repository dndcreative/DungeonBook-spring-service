package com.micro.i113_dungeon_book.service;

import com.micro.i113_dungeon_book.model.PlayerType;
import com.micro.i113_dungeon_book.model.dto.SessionDto;
import com.micro.i113_dungeon_book.model.entity.GameEntity;
import com.micro.i113_dungeon_book.model.entity.SessionEntity;
import com.micro.i113_dungeon_book.model.entity.UserEntity;
import com.micro.i113_dungeon_book.repository.GamesRepository;
import com.micro.i113_dungeon_book.repository.SessionRepository;
import com.micro.i113_dungeon_book.repository.UserRepository;
import com.micro.i113_dungeon_book.service.converter.core.SessionConverter;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@AllArgsConstructor
@Slf4j
public class SessionService {

    private SessionRepository sessionRepository;
    private UserRepository userRepository;
    private GamesRepository gamesRepository;

    private SessionConverter converter;

    public List<SessionDto> getSessionsList(String userId) {
        if (isMasterEntity(userId)) {
            return converter.convertEntitiesToDto(sessionRepository.findAll());
        }
        return new ArrayList<>();
    }

    public SessionDto create(SessionDto dto) {
        if (isMasterEntity(dto.getUserUuid())) {
            SessionEntity savedSession = sessionRepository.save(converter.convertDtoToEntity(dto));
            return converter.convertEntityToDto(savedSession);
        }
        return new SessionDto();
    }

    public SessionDto remove(SessionDto dto) {
        if (isMasterEntity(dto.getUserUuid())) {
            sessionRepository.delete(converter.convertDtoToEntity(dto));
            return dto;
        }
        return new SessionDto();
    }

    public SessionDto join(SessionDto dto) {
        if (isPlayerEntity(dto.getUserUuid())) {
            Optional<UserEntity> userEntity = userRepository.findByUuid(UUID.fromString(dto.getUserUuid()));
            Optional<SessionEntity> sessionEntity = sessionRepository.findByUuid(UUID.fromString(dto.getUuid()));
            if (userEntity.isPresent() && sessionEntity.isPresent()) {
                gamesRepository.save(GameEntity.builder()
                        .userUUID(userEntity.get().getUuid().toString())
                        .sessionUUID(sessionEntity.get().getUuid().toString())
                        .build());
                log.warn("USER:" + userEntity.get().getName() + " AddedTo:" + sessionEntity.get().getName());
            }
        }
        return new SessionDto();
    }

    public SessionDto leave(SessionDto dto) {
        if (isPlayerEntity(dto.getUserUuid())) {
            Optional<UserEntity> userEntity = userRepository.findByUuid(UUID.fromString(dto.getUserUuid()));
            Optional<SessionEntity> sessionEntity = sessionRepository.findByUuid(UUID.fromString(dto.getUuid()));
            if (userEntity.isPresent() && sessionEntity.isPresent()) {
                Optional<GameEntity> gameEntity = gamesRepository.findByUserUUIDAndSessionUUID(
                        userEntity.get().getUuid().toString(),
                        sessionEntity.get().getUuid().toString()
                );
                gameEntity.ifPresent(entity -> gamesRepository.delete(entity));
                log.warn("USER:" + userEntity.get().getName() + " RemovedFrom:" + sessionEntity.get().getName());
            }
        }
        return dto;
    }

    private boolean isMasterEntity(String userId) {
        Optional<UserEntity> userEntity = userRepository.findByUuid(UUID.fromString(userId));
        return userEntity.isPresent() && userEntity.get().getType().equals(PlayerType.MASTER);
    }

    private boolean isPlayerEntity(String userId) {
        Optional<UserEntity> userEntity = userRepository.findByUuid(UUID.fromString(userId));
        return userEntity.isPresent() && userEntity.get().getType().equals(PlayerType.PLAYER);
    }

}

package com.micro.i113_dungeon_book.service;

import com.micro.i113_dungeon_book.model.dto.SessionDto;
import com.micro.i113_dungeon_book.repository.GamesRepository;
import com.micro.i113_dungeon_book.repository.SessionRepository;
import com.micro.i113_dungeon_book.repository.UserRepository;
import com.micro.i113_dungeon_book.service.converter.core.SessionConverter;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class SessionService {

    private SessionRepository sessionRepository;
    private UserRepository userRepository;
    private GamesRepository gamesRepository;

    private SessionConverter converter;

    public List<SessionDto> getSessionsList(String userId) {

        return new ArrayList<>();
    }

    public SessionDto create(SessionDto dto) {

        return new SessionDto();
    }

    public SessionDto remove(SessionDto dto) {

        return new SessionDto();
    }

    public SessionDto join(SessionDto dto) {

        return new SessionDto();
    }

    public SessionDto leave(SessionDto dto) {

        return dto;
    }

//    private boolean isMasterEntity(String userId) {
//        Optional<UserEntity> userEntity = userRepository.findByUuid(UUID.fromString(userId));
//        return userEntity.isPresent() && userEntity.get().getType().equals(PlayerType.MASTER);
//    }

//    private boolean isPlayerEntity(String userId) {
//        Optional<UserEntity> userEntity = userRepository.findByUuid(UUID.fromString(userId));
//        return userEntity.isPresent() && userEntity.get().getType().equals(PlayerType.PLAYER);
//    }

}

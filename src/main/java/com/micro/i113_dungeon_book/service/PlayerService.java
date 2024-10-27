package com.micro.i113_dungeon_book.service;

import com.micro.i113_dungeon_book.model.PlayerType;
import com.micro.i113_dungeon_book.model.dto.PlayerDto;
import com.micro.i113_dungeon_book.model.dto.core.CharacterDto;
import com.micro.i113_dungeon_book.model.dto.core.SkillDto;
import com.micro.i113_dungeon_book.model.entity.CharacterEntity;
import com.micro.i113_dungeon_book.model.entity.SessionEntity;
import com.micro.i113_dungeon_book.model.entity.UserEntity;
import com.micro.i113_dungeon_book.repository.*;
import com.micro.i113_dungeon_book.service.converter.PlayerConverter;
import com.micro.i113_dungeon_book.service.converter.core.*;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@AllArgsConstructor
public class PlayerService {

    private UserRepository userRepository;
    private SessionRepository sessionRepository;
    private CharacterRepository characterRepository;
    private EquipmentRepository equipmentRepository;
    private AbilitiesRepository abilitiesRepository;

    private PlayerConverter playerConverter;
    private SessionConverter sessionConverter;
    private CharacterConverter characterConverter;
    private SkillConverter skillConverter;
    private EquipmentConverter equipmentConverter;
    private AbilityConverter abilityConverter;

    public PlayerDto createPlayer(PlayerDto dto) {
        if (isPlayerEntity(dto.getUuid())) {
            UserEntity userEntity = userRepository.save(playerConverter.convertDtoToEntity(dto));
            return playerConverter.convertEntityToDto(userEntity);
        }
        return new PlayerDto();
    }

    public PlayerDto loginPlayer(PlayerDto dto){
        if (isPlayerEntity(dto.getUuid())) {
            Optional<UserEntity> userEntity = userRepository.findByUuid(UUID.fromString(dto.getUuid()));
            if(userEntity.isPresent()){
                PlayerDto resultDto = playerConverter.convertEntityToDto(userEntity.get());
//
//                List<SessionEntity> sessions = sessionRepository.findAll();
//                resultDto.setSession(sessionConverter.convertEntityToDto(sessions.get(0)));
//
//                Optional<CharacterEntity> characterEntity = characterRepository.findByUserId(userEntity.get().getUuid());
//                CharacterDto characterDto = characterConverter.convertEntityToDto(characterEntity.get());
//
//                SkillDto skillDto = skillConverter.convertEntityToDto(characterEntity.get().getSkillEntity());
//                characterDto.setSkillDto(skillDto);
//
//                characterDto.setAbilities(abilityConverter.convertEntitiesToDto(characterEntity.get().getAbilityEntityList()));
//                characterDto.setInventory(equipmentConverter.convertEntitiesToDto(characterEntity.get().getInventoryEntities()));

//                resultDto.setSelectedCharacter(characterDto);
                return resultDto;
            }
            return new PlayerDto();
        }
        return new PlayerDto();
    }

    private boolean isPlayerEntity(String userId) {
        Optional<UserEntity> userEntity = userRepository.findByUuid(UUID.fromString(userId));
        return userEntity.isPresent() && userEntity.get().getType().equals(PlayerType.PLAYER);
    }
}

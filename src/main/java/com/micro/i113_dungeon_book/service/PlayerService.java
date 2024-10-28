package com.micro.i113_dungeon_book.service;

import com.micro.i113_dungeon_book.model.PlayerType;
import com.micro.i113_dungeon_book.model.dto.PlayerDto;
import com.micro.i113_dungeon_book.model.dto.SessionDto;
import com.micro.i113_dungeon_book.model.dto.core.CharacterDto;
import com.micro.i113_dungeon_book.model.entity.CharacterEntity;
import com.micro.i113_dungeon_book.model.entity.UserEntity;
import com.micro.i113_dungeon_book.repository.*;
import com.micro.i113_dungeon_book.service.converter.PlayerConverter;
import com.micro.i113_dungeon_book.service.converter.core.*;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

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

        return new PlayerDto();
    }

    public PlayerDto loginPlayer(PlayerDto dto) {
        Optional<UserEntity> userEntity = userRepository.findUserEntityByName(dto.getName());
        if (isPlayerEntity(userEntity)) {
            UserEntity user = userEntity.get();
            PlayerDto playerDto = playerConverter.convertEntityToDto(user);
            SessionDto sessionDto = sessionConverter.convertEntityToDto(sessionRepository.findAll().get(0));

            CharacterEntity characterEntity = user.getCharacterEntities().get(0);
            CharacterDto characterDto = characterConverter.convertEntityToDto(characterEntity);
            characterDto.setSkillDto(skillConverter.convertEntityToDto(characterEntity.getSkillEntity()));
            characterDto.setEquipment(characterEntity.getEquipmentEntities().get(0).getPropText());
            characterDto.setAbility(characterEntity.getAbilityEntityList().get(0).getAbilityText());

            playerDto.setSession(sessionDto);
            playerDto.setSelectedCharacter(characterDto);
            return playerDto;
        }
        return new PlayerDto();
    }

    private boolean isPlayerEntity(Optional<UserEntity> entity) {
        return entity.isPresent() && entity.get().getType().equals(PlayerType.PLAYER);
    }
}

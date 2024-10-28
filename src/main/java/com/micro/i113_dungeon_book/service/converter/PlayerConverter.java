package com.micro.i113_dungeon_book.service.converter;

import com.micro.i113_dungeon_book.model.dto.PlayerDto;
import com.micro.i113_dungeon_book.model.entity.UserEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class PlayerConverter {

    public PlayerDto convertEntityToDto(UserEntity inputEntity) {
        return PlayerDto.builder()
                .id(inputEntity.getId())
                .name(inputEntity.getName())
                .password(inputEntity.getPassword())
                .playerType(inputEntity.getType())
                .build();
    }

    public UserEntity convertDtoToEntity(PlayerDto inputDto) {
        return UserEntity.builder()
                .id(inputDto.getId())
                .name(inputDto.getName())
                .password(inputDto.getPassword())
                .type(inputDto.getPlayerType())
                .build();
    }
}

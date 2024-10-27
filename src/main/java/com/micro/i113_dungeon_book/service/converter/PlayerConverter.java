package com.micro.i113_dungeon_book.service.converter;

import com.micro.i113_dungeon_book.model.dto.PlayerDto;
import com.micro.i113_dungeon_book.model.entity.UserEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@AllArgsConstructor
public class PlayerConverter {

    public PlayerDto convertEntityToDto(UserEntity inputEntity) {
        return PlayerDto.builder()
                .uuid(inputEntity.getUuid().toString())
                .name(inputEntity.getName())
                .password(inputEntity.getPassword())
                .playerType(inputEntity.getType())
                .build();
    }

    public UserEntity convertDtoToEntity(PlayerDto inputDto) {
        return UserEntity.builder()
                .uuid(inputDto.getUuid() != null ? UUID.fromString(inputDto.getUuid()) : UUID.randomUUID())
                .name(inputDto.getName())
                .password(inputDto.getPassword())
                .type(inputDto.getPlayerType())
                .build();
    }
}

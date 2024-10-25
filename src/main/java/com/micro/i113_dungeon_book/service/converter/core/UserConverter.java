package com.micro.i113_dungeon_book.service.converter.core;

import com.micro.i113_dungeon_book.model.dto.core.UserDto;
import com.micro.i113_dungeon_book.model.entity.UserEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@AllArgsConstructor
public class UserConverter {

    public UserDto convertEntityToDto(UserEntity inputEntity) {
        return UserDto.builder()
                .uuid(inputEntity.getUuid().toString())
                .name(inputEntity.getName())
                .password(inputEntity.getPassword())
                .type(inputEntity.getType())
                .build();
    }

    public UserEntity convertDtoToEntity(UserDto inputDto) {
        return UserEntity.builder()
                .uuid(inputDto.getUuid() != null ? UUID.fromString(inputDto.getUuid()) : UUID.randomUUID())
                .name(inputDto.getName())
                .password(inputDto.getPassword())
                .type(inputDto.getType())
                .build();
    }
}

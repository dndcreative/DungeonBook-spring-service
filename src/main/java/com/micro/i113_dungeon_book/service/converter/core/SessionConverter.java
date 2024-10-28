package com.micro.i113_dungeon_book.service.converter.core;

import com.micro.i113_dungeon_book.model.dto.SessionDto;
import com.micro.i113_dungeon_book.model.entity.SessionEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@AllArgsConstructor
public class SessionConverter {

    public List<SessionDto> convertEntitiesToDto(List<SessionEntity> entitiesList) {
        return entitiesList.stream()
                .map(this::convertEntityToDto)
                .collect(Collectors.toList());
    }

    public List<SessionEntity> convertDtoToEntities(List<SessionDto> dtoList) {
        return dtoList.stream()
                .map(this::convertDtoToEntity)
                .collect(Collectors.toList());
    }

    public SessionDto convertEntityToDto(SessionEntity inputEntity) {
        return SessionDto.builder()
                .id(inputEntity.getId())
                .name(inputEntity.getName())
                .password(inputEntity.getPassword())
                .maxUsers(inputEntity.getMaxUsers())
                .build();
    }

    public SessionEntity convertDtoToEntity(SessionDto inputDto) {
        return SessionEntity.builder()
                .id(inputDto.getId())
                .name(inputDto.getName())
                .password(inputDto.getPassword())
                .maxUsers(inputDto.getMaxUsers())
                .build();
    }
}

package com.micro.i113_dungeon_book.service.converter.core;

import com.micro.i113_dungeon_book.model.dto.core.InventoryDto;
import com.micro.i113_dungeon_book.model.entity.InventoryEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@AllArgsConstructor
public class InventoryConverter {

    public List<InventoryDto> convertEntitiesToDto(List<InventoryEntity> entitiesList) {
        return entitiesList.stream()
                .map(this::convertEntityToDto)
                .collect(Collectors.toList());
    }

    public List<InventoryEntity> convertDtoToEntities(List<InventoryDto> dtoList) {
        return dtoList.stream()
                .map(this::convertDtoToEntity)
                .collect(Collectors.toList());
    }

    public InventoryDto convertEntityToDto(InventoryEntity inputEntity) {
        return InventoryDto.builder()
                .id(inputEntity.getId())
                .propName(inputEntity.getPropName())
                .propDescription(inputEntity.getPropDescription())
                .build();
    }

    public InventoryEntity convertDtoToEntity(InventoryDto inputDto) {
        return InventoryEntity.builder()
                .id(inputDto.getId())
                .propName(inputDto.getPropName())
                .propDescription(inputDto.getPropDescription())
                .build();
    }
}

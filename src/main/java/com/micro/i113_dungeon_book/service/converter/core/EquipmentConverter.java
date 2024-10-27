package com.micro.i113_dungeon_book.service.converter.core;

import com.micro.i113_dungeon_book.model.dto.core.EquipmentDto;
import com.micro.i113_dungeon_book.model.entity.EquipmentEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@AllArgsConstructor
public class EquipmentConverter {

    public List<EquipmentDto> convertEntitiesToDto(List<EquipmentEntity> entitiesList) {
        return entitiesList.stream()
                .map(this::convertEntityToDto)
                .collect(Collectors.toList());
    }

    public List<EquipmentEntity> convertDtoToEntities(List<EquipmentDto> dtoList) {
        return dtoList.stream()
                .map(this::convertDtoToEntity)
                .collect(Collectors.toList());
    }

    public EquipmentDto convertEntityToDto(EquipmentEntity inputEntity) {
        return EquipmentDto.builder()
                .id(inputEntity.getId())
                .propName(inputEntity.getPropName())
                .propDescription(inputEntity.getPropDescription())
                .propText(inputEntity.getPropText())
                .build();
    }

    public EquipmentEntity convertDtoToEntity(EquipmentDto inputDto) {
        return EquipmentEntity.builder()
                .id(inputDto.getId())
                .propName(inputDto.getPropName())
                .propDescription(inputDto.getPropDescription())
                .propText(inputDto.getPropText())
                .build();
    }
}

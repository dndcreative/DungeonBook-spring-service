package com.micro.i113_dungeon_book.service.converter.core;

import com.micro.i113_dungeon_book.model.dto.core.AbilityDto;
import com.micro.i113_dungeon_book.model.entity.AbilityEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@AllArgsConstructor
public class AbilityConverter {

    public List<AbilityDto> convertEntitiesToDto(List<AbilityEntity> entitiesList) {
        return entitiesList.stream()
                .map(this::convertEntityToDto)
                .collect(Collectors.toList());
    }

    public List<AbilityEntity> convertDtoToEntities(List<AbilityDto> dtoList) {
        return dtoList.stream()
                .map(this::convertDtoToEntity)
                .collect(Collectors.toList());
    }

    public AbilityDto convertEntityToDto(AbilityEntity inputEntity) {
        return AbilityDto.builder()
                .id(inputEntity.getId())
                .title(inputEntity.getTitle())
                .subtitle(inputEntity.getSubtitle())
                .description(inputEntity.getDescription())
                .text(inputEntity.getAbilityText())
                .build();
    }

    public AbilityEntity convertDtoToEntity(AbilityDto inputDto) {
        return AbilityEntity.builder()
                .id(inputDto.getId())
                .title(inputDto.getTitle())
                .subtitle(inputDto.getSubtitle())
                .description(inputDto.getDescription())
                .abilityText(inputDto.getText())
                .build();
    }
}

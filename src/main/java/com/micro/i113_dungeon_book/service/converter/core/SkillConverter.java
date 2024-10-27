package com.micro.i113_dungeon_book.service.converter.core;

import com.micro.i113_dungeon_book.model.dto.core.SkillDto;
import com.micro.i113_dungeon_book.model.entity.SkillEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class SkillConverter {

    public SkillDto convertEntityToDto(SkillEntity inputEntity) {
        return SkillDto.builder()
                .id(inputEntity.getId())
                .strength(inputEntity.getStrength())
                .perception(inputEntity.getPerception())
                .endurance(inputEntity.getEndurance())
                .charisma(inputEntity.getCharisma())
                .intelligence(inputEntity.getIntelligence())
                .agility(inputEntity.getAgility())
                .luck(inputEntity.getLuck())
                .build();
    }

    public SkillEntity convertDtoToEntity(SkillDto inputDto) {
        return SkillEntity.builder()
                .id(inputDto.getId())
                .strength(inputDto.getStrength())
                .perception(inputDto.getPerception())
                .endurance(inputDto.getEndurance())
                .charisma(inputDto.getCharisma())
                .intelligence(inputDto.getIntelligence())
                .agility(inputDto.getAgility())
                .luck(inputDto.getLuck())
                .build();
    }
}

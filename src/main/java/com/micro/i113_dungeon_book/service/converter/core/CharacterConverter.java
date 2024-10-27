package com.micro.i113_dungeon_book.service.converter.core;

import com.micro.i113_dungeon_book.model.dto.core.CharacterDto;
import com.micro.i113_dungeon_book.model.entity.CharacterEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class CharacterConverter {

    public CharacterDto convertEntityToDto(CharacterEntity inputEntity) {
        return CharacterDto.builder()
                .id(inputEntity.getId())
                .name(inputEntity.getName())
                .health(inputEntity.getHealth())
                .stamina(inputEntity.getStamina())
                .mana(inputEntity.getMana())
                .build();
    }

    public CharacterEntity convertDtoToEntity(CharacterDto inputDto) {
        return CharacterEntity.builder()
                .id(inputDto.getId())
                .name(inputDto.getName())
                .health(inputDto.getHealth())
                .stamina(inputDto.getStamina())
                .mana(inputDto.getMana())
                .build();
    }
}

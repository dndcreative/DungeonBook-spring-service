package com.micro.i113_dungeon_book.model.dto.core;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class CharacterDto {

    private Integer id;

    private String name;

    private int health;
    private int stamina;
    private int mana;

    private SkillDto skillDto;
    private List<EquipmentDto> inventory;
    private List<AbilityDto> abilities;
}

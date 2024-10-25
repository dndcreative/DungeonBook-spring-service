package com.micro.i113_dungeon_book.model.dto.core;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class SpecialDto {

    private Integer id;

    private Integer strength;
    private Integer perception;
    private Integer endurance;
    private Integer charisma;
    private Integer intelligence;
    private Integer agility;
    private Integer luck;
}

package com.micro.i113_dungeon_book.model.dto.core;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class EquipmentDto {

    private Integer id;

    private String propName;
    private String propDescription;
    private String propText;
}

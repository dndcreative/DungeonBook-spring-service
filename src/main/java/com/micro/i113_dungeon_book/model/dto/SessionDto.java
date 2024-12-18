package com.micro.i113_dungeon_book.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class SessionDto {

    private Integer id;
    private Integer userId;

    private String name;
    private String password;
    private int maxUsers;
}

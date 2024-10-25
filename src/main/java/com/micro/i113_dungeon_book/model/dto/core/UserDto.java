package com.micro.i113_dungeon_book.model.dto.core;

import com.micro.i113_dungeon_book.model.PlayerType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class UserDto {

    private String uuid;

    private String name;
    private String password;
    private PlayerType type;
}

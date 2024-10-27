package com.micro.i113_dungeon_book.model.dto;

import com.micro.i113_dungeon_book.model.PlayerType;
import com.micro.i113_dungeon_book.model.dto.core.CharacterDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class PlayerDto {

    private SessionDto session;

    private String uuid;

    private String name;
    private String password;
    private PlayerType playerType;

    private CharacterDto selectedCharacter;
    private List<CharacterDto> characters;

}

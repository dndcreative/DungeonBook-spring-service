package com.micro.i113_dungeon_book.service.core;

import com.micro.i113_dungeon_book.model.dto.core.CharacterDto;
import com.micro.i113_dungeon_book.repository.CharacterRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CharacterService {

    private CharacterRepository characterRepository;

    public CharacterDto update(CharacterDto dto) {
        return new CharacterDto();
    }
}

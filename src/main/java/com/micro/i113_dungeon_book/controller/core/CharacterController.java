package com.micro.i113_dungeon_book.controller.core;

import com.micro.i113_dungeon_book.model.dto.core.CharacterDto;
import com.micro.i113_dungeon_book.service.core.CharacterService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/api/dnd/character/")
public class CharacterController {

    private CharacterService service;

    @PutMapping("/")
    public CharacterDto update(@RequestBody CharacterDto dto) {
        return service.update(dto);
    }


}

package com.micro.i113_dungeon_book.controller.core;

import com.micro.i113_dungeon_book.model.dto.core.AbilityDto;
import com.micro.i113_dungeon_book.service.core.AbilityService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/api/dnd/ability/")
public class AbilitiesController {

    private AbilityService service;

    @PutMapping("/")
    public AbilityDto update(@RequestBody AbilityDto dto) {
        return service.update(dto);
    }
}

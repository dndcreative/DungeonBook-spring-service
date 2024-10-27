package com.micro.i113_dungeon_book.controller.core;

import com.micro.i113_dungeon_book.model.dto.core.SkillDto;
import com.micro.i113_dungeon_book.service.core.SkillService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/api/dnd/skill/")
public class SkillController {

    private SkillService service;

    @PutMapping("/")
    public SkillDto update(@RequestBody SkillDto dto) {
        return service.update(dto);
    }
}

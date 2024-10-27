package com.micro.i113_dungeon_book.controller.core;

import com.micro.i113_dungeon_book.model.dto.core.SpecialDto;
import com.micro.i113_dungeon_book.service.core.SpecialService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/api/dnd/special/")
public class SpecialController {

    private SpecialService service;

    @PutMapping("/")
    public SpecialDto update(@RequestBody SpecialDto dto) {
        return service.update(dto);
    }
}

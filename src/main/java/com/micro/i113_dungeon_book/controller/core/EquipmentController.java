package com.micro.i113_dungeon_book.controller.core;

import com.micro.i113_dungeon_book.model.dto.core.EquipmentDto;
import com.micro.i113_dungeon_book.service.core.EquipmentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/api/dnd/equipment/")
public class EquipmentController {

    private EquipmentService service;

    @PutMapping("/")
    public EquipmentDto update(@RequestBody EquipmentDto dto) {
        return service.update(dto);
    }

}

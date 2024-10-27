package com.micro.i113_dungeon_book.controller.core;

import com.micro.i113_dungeon_book.model.dto.core.InventoryDto;
import com.micro.i113_dungeon_book.service.core.InventoryService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/api/dnd/inventory/")
public class InventoryController {

    private InventoryService service;

    @PutMapping("/")
    public InventoryDto update(@RequestBody InventoryDto dto) {
        return service.update(dto);
    }

}

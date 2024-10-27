package com.micro.i113_dungeon_book.service.core;

import com.micro.i113_dungeon_book.model.dto.core.InventoryDto;
import com.micro.i113_dungeon_book.repository.InventoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class InventoryService {

    private InventoryRepository inventoryRepository;

    public InventoryDto update(InventoryDto dto) {
        return new InventoryDto();
    }
}

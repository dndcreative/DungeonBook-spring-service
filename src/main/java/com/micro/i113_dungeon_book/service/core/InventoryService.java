package com.micro.i113_dungeon_book.service.core;

import com.micro.i113_dungeon_book.model.dto.core.InventoryDto;
import com.micro.i113_dungeon_book.model.entity.InventoryEntity;
import com.micro.i113_dungeon_book.repository.InventoryRepository;
import com.micro.i113_dungeon_book.service.converter.core.InventoryConverter;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class InventoryService {

    private InventoryRepository repository;
    private InventoryConverter converter;

    public InventoryDto update(InventoryDto dto) {
        InventoryEntity savedEntity = repository.save(converter.convertDtoToEntity(dto));
        return converter.convertEntityToDto(savedEntity);
    }
}

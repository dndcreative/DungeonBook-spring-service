package com.micro.i113_dungeon_book.service.core;

import com.micro.i113_dungeon_book.exception.DndException;
import com.micro.i113_dungeon_book.model.dto.core.InventoryDto;
import com.micro.i113_dungeon_book.model.entity.InventoryEntity;
import com.micro.i113_dungeon_book.repository.InventoryRepository;
import com.micro.i113_dungeon_book.service.converter.core.InventoryConverter;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class InventoryService {

    private InventoryRepository repository;
    private InventoryConverter converter;

    public InventoryDto update(InventoryDto dto) {
        Optional<InventoryEntity> entity = repository.findById(dto.getId());
        if (entity.isPresent()) {
            InventoryEntity savedEntity = repository.save(converter.convertDtoToEntity(dto));
            return converter.convertEntityToDto(savedEntity);
        }
        throw new DndException("InventoryEntityNotFound", HttpStatus.NOT_FOUND);
    }
}

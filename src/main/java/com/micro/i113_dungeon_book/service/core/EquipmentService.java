package com.micro.i113_dungeon_book.service.core;

import com.micro.i113_dungeon_book.model.dto.core.EquipmentDto;
import com.micro.i113_dungeon_book.model.entity.EquipmentEntity;
import com.micro.i113_dungeon_book.repository.EquipmentRepository;
import com.micro.i113_dungeon_book.service.converter.core.EquipmentConverter;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EquipmentService {

    private EquipmentRepository repository;
    private EquipmentConverter converter;

    public EquipmentDto update(EquipmentDto dto) {
        EquipmentEntity savedEntity = repository.save(converter.convertDtoToEntity(dto));
        return converter.convertEntityToDto(savedEntity);
    }
}

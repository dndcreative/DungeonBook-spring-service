package com.micro.i113_dungeon_book.service.core;

import com.micro.i113_dungeon_book.exception.DndException;
import com.micro.i113_dungeon_book.model.dto.core.SpecialDto;
import com.micro.i113_dungeon_book.model.entity.SpecialEntity;
import com.micro.i113_dungeon_book.repository.SpecialRepository;
import com.micro.i113_dungeon_book.service.converter.core.SpecialConverter;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class SpecialService {

    private SpecialRepository repository;
    private SpecialConverter converter;

    public SpecialDto update(SpecialDto dto) {
        Optional<SpecialEntity> entity = repository.findById(dto.getId());
        if (entity.isPresent()) {
            SpecialEntity savedEntity = repository.save(converter.convertDtoToEntity(dto));
            return converter.convertEntityToDto(savedEntity);
        }
        throw new DndException("SpecialEntityNotFound", HttpStatus.NOT_FOUND);
    }
}

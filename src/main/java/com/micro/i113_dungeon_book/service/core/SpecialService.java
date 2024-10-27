package com.micro.i113_dungeon_book.service.core;

import com.micro.i113_dungeon_book.model.dto.core.SpecialDto;
import com.micro.i113_dungeon_book.model.entity.SpecialEntity;
import com.micro.i113_dungeon_book.repository.SpecialRepository;
import com.micro.i113_dungeon_book.service.converter.core.SpecialConverter;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class SpecialService {

    private SpecialRepository repository;
    private SpecialConverter converter;

    public SpecialDto update(SpecialDto dto) {
        SpecialEntity savedEntity = repository.save(converter.convertDtoToEntity(dto));
        return converter.convertEntityToDto(savedEntity);
    }
}

package com.micro.i113_dungeon_book.service.core;

import com.micro.i113_dungeon_book.model.dto.core.AbilityDto;
import com.micro.i113_dungeon_book.model.entity.AbilityEntity;
import com.micro.i113_dungeon_book.repository.AbilitiesRepository;
import com.micro.i113_dungeon_book.service.converter.core.AbilityConverter;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AbilityService {

    private AbilitiesRepository repository;
    private AbilityConverter converter;

    public AbilityDto update(AbilityDto dto) {
        AbilityEntity savedEntity = repository.save(converter.convertDtoToEntity(dto));
        return converter.convertEntityToDto(savedEntity);
    }
}

package com.micro.i113_dungeon_book.service.core;

import com.micro.i113_dungeon_book.model.dto.core.SkillDto;
import com.micro.i113_dungeon_book.model.entity.SkillEntity;
import com.micro.i113_dungeon_book.repository.SkillRepository;
import com.micro.i113_dungeon_book.service.converter.core.SkillConverter;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class SkillService {

    private SkillRepository repository;
    private SkillConverter converter;

    public SkillDto update(SkillDto dto) {
        SkillEntity savedEntity = repository.save(converter.convertDtoToEntity(dto));
        return converter.convertEntityToDto(savedEntity);
    }
}

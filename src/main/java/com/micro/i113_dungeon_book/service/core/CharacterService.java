package com.micro.i113_dungeon_book.service.core;

import com.micro.i113_dungeon_book.exception.DndException;
import com.micro.i113_dungeon_book.model.dto.core.CharacterDto;
import com.micro.i113_dungeon_book.model.entity.CharacterEntity;
import com.micro.i113_dungeon_book.repository.CharacterRepository;
import com.micro.i113_dungeon_book.service.converter.core.CharacterConverter;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class CharacterService {

    private CharacterRepository repository;
    private CharacterConverter converter;

    public CharacterDto update(CharacterDto dto) {
        Optional<CharacterEntity> entity = repository.findById(dto.getId());
        if (entity.isPresent()) {
            CharacterEntity savedEntity = repository.save(converter.convertDtoToEntity(dto));
            return converter.convertEntityToDto(savedEntity);
        }
        throw new DndException("CharacterEntityNotFound", HttpStatus.NOT_FOUND);
    }
}

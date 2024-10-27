package com.micro.i113_dungeon_book.service.core;

import com.micro.i113_dungeon_book.model.dto.core.AbilityDto;
import com.micro.i113_dungeon_book.repository.AbilitiesRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AbilityService {

    private AbilitiesRepository abilitiesRepository;

    public AbilityDto update(AbilityDto dto) {
        return new AbilityDto();
    }
}

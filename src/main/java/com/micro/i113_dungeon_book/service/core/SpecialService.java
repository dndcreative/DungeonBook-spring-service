package com.micro.i113_dungeon_book.service.core;

import com.micro.i113_dungeon_book.model.dto.core.SpecialDto;
import com.micro.i113_dungeon_book.repository.SpecialRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class SpecialService {

    private SpecialRepository specialRepository;

    public SpecialDto update(SpecialDto dto) {
        return new SpecialDto();
    }
}

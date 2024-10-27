package com.micro.i113_dungeon_book.service;

import com.micro.i113_dungeon_book.model.dto.PlayerDto;
import com.micro.i113_dungeon_book.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class PlayerService {

    private UserRepository userRepository;

    public List<PlayerDto> getUsersList(String userId) {
        return new ArrayList<>();
    }
}

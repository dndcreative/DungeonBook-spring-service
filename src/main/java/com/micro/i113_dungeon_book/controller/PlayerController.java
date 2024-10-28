package com.micro.i113_dungeon_book.controller;

import com.micro.i113_dungeon_book.model.dto.PlayerDto;
import com.micro.i113_dungeon_book.service.PlayerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/dnd/player/")
public class PlayerController {

    private final PlayerService service;

    @GetMapping("/all")
    public PlayerDto getAllUnits(@RequestBody PlayerDto dto) {
        return service.loginPlayer(dto);
    }




}

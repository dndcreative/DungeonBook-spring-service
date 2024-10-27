package com.micro.i113_dungeon_book.controller;

import com.micro.i113_dungeon_book.model.dto.PlayerDto;
import com.micro.i113_dungeon_book.service.PlayerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/dnd/player/")
public class PlayerController {

    private final PlayerService service;

    @GetMapping("/all")
    public List<PlayerDto> getAllUnits(@RequestHeader(value = "UserId") String userId) {
        return new ArrayList<PlayerDto>();
    }




}

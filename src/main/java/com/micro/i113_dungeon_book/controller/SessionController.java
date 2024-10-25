package com.micro.i113_dungeon_book.controller;

import com.micro.i113_dungeon_book.model.dto.SessionDto;
import com.micro.i113_dungeon_book.service.SessionService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/dnd/session/")
public class SessionController {

    private final SessionService service;

    @GetMapping("/list")
    public List<SessionDto> getAllUnits(@RequestHeader(value = "UserId") String userId) {
        return new ArrayList<SessionDto>();
    }

    @PostMapping("/create")
    public SessionDto create(@RequestBody SessionDto unitDto) {
        return new SessionDto();
    }

    @PostMapping("/remove")
    public SessionDto remove(@RequestBody SessionDto unitDto) {
        return new SessionDto();
    }

    @PostMapping("/join")
    public SessionDto join(@RequestBody SessionDto unitDto) {
        return new SessionDto();
    }

    @PostMapping("/leave")
    public SessionDto leave(@RequestBody SessionDto unitDto) {
        return new SessionDto();
    }
}

package com.micro.i113_dungeon_book.controller;

import com.micro.i113_dungeon_book.model.dto.SessionDto;
import com.micro.i113_dungeon_book.service.SessionService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/dnd/session/")
public class SessionController {

    private final SessionService service;

    @GetMapping("/list")
    public List<SessionDto> getAllUnits(@RequestHeader(value = "UserId") String userId) {
        return service.getSessionsList(userId);
    }

    @PostMapping("/create")
    public SessionDto create(@RequestBody SessionDto dto) {
        return service.create(dto);
    }

    @PostMapping("/remove")
    public SessionDto remove(@RequestBody SessionDto dto) {
        return service.remove(dto);
    }

    @PostMapping("/join")
    public SessionDto join(@RequestBody SessionDto dto) {
        return service.join(dto);
    }

    @PostMapping("/leave")
    public SessionDto leave(@RequestBody SessionDto dto) {
        return service.leave(dto);
    }
}

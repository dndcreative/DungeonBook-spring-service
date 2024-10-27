package com.micro.i113_dungeon_book.service;

import com.micro.i113_dungeon_book.model.dto.SessionDto;
import com.micro.i113_dungeon_book.repository.SessionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class SessionService {

    public SessionRepository sessionRepository;

    public List<SessionDto> getSessionsList(String userId){
        return new ArrayList<>();
    }

    public SessionDto create(SessionDto dto){
        return new SessionDto();
    }

    public SessionDto remove(SessionDto dto){
        return dto;
    }

    public SessionDto join(SessionDto dto){
        return dto;
    }

    public SessionDto leave(SessionDto dto){
        return dto;
    }


}

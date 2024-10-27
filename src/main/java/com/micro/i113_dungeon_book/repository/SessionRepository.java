package com.micro.i113_dungeon_book.repository;

import com.micro.i113_dungeon_book.model.entity.SessionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SessionRepository extends JpaRepository<SessionEntity, Integer> {

    Optional<SessionEntity> findById(Integer id);
}

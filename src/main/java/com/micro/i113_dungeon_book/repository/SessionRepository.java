package com.micro.i113_dungeon_book.repository;

import com.micro.i113_dungeon_book.model.entity.SessionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface SessionRepository extends JpaRepository<SessionEntity, Integer> {

    Optional<SessionEntity> findByUuid(UUID uuid);
}

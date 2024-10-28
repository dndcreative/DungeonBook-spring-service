package com.micro.i113_dungeon_book.repository;

import com.micro.i113_dungeon_book.model.entity.SessionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<SessionEntity, Integer> {

}

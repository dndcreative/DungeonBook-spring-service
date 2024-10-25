package com.micro.i113_dungeon_book.repository;

import com.micro.i113_dungeon_book.model.entity.CharacterEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CharacterRepository extends JpaRepository<CharacterEntity, Integer> {
}

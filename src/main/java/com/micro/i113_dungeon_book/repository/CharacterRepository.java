package com.micro.i113_dungeon_book.repository;

import com.micro.i113_dungeon_book.model.entity.CharacterEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface CharacterRepository extends JpaRepository<CharacterEntity, Integer> {

//    Optional<CharacterEntity> findBy(UUID id);
}

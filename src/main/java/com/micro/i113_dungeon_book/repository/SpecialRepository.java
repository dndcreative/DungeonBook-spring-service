package com.micro.i113_dungeon_book.repository;

import com.micro.i113_dungeon_book.model.entity.SpecialEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SpecialRepository extends JpaRepository<SpecialEntity, Integer> {

    Optional<SpecialEntity> findById(Integer id);
}

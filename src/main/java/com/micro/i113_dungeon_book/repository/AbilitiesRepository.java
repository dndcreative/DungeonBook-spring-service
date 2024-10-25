package com.micro.i113_dungeon_book.repository;

import com.micro.i113_dungeon_book.model.entity.AbilityEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AbilitiesRepository extends JpaRepository<AbilityEntity, Integer> {
}

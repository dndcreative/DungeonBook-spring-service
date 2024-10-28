package com.micro.i113_dungeon_book.repository;

import com.micro.i113_dungeon_book.model.entity.AbilityEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AbilitiesRepository extends JpaRepository<AbilityEntity, Integer> {

}

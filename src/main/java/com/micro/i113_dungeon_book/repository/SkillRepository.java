package com.micro.i113_dungeon_book.repository;

import com.micro.i113_dungeon_book.model.entity.SkillEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SkillRepository extends JpaRepository<SkillEntity, Integer> {

    Optional<SkillEntity> findById(Integer id);
}

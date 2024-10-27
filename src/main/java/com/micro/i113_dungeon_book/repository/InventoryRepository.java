package com.micro.i113_dungeon_book.repository;

import com.micro.i113_dungeon_book.model.entity.InventoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface InventoryRepository extends JpaRepository<InventoryEntity, Integer> {

    Optional<InventoryEntity> findById(Integer id);
}

package com.micro.i113_dungeon_book.repository;

import com.micro.i113_dungeon_book.model.entity.InventoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<InventoryEntity, Integer> {
}

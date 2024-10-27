package com.micro.i113_dungeon_book.repository;

import com.micro.i113_dungeon_book.model.entity.EquipmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EquipmentRepository extends JpaRepository<EquipmentEntity, Integer> {

    Optional<EquipmentEntity> findById(Integer id);

}

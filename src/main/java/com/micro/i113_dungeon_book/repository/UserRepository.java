package com.micro.i113_dungeon_book.repository;

import com.micro.i113_dungeon_book.model.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {

    Optional<UserEntity> findByUuid(UUID uuid);
}

package com.micro.i113_dungeon_book.repository;

import com.micro.i113_dungeon_book.model.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {
}

package com.micro.i113_dungeon_book.model.entity;

import com.micro.i113_dungeon_book.model.PlayerType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "users")
public class UserEntity {

    @Id
    @Column(name = "uuid")
    private UUID uuid;

    private String name;
    private String password;

    @Enumerated(EnumType.STRING)
    private PlayerType type;

}

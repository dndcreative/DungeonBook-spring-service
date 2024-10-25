package com.micro.i113_dungeon_book.model.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "specials")
public class SpecialEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer strength;
    private Integer perception;
    private Integer endurance;
    private Integer charisma;
    private Integer intelligence;
    private Integer agility;
    private Integer luck;

}

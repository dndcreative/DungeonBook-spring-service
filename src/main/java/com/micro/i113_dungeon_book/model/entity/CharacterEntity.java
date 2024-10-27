package com.micro.i113_dungeon_book.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "characters")
public class CharacterEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private Integer health;
    private Integer stamina;
    private Integer mana;

    @OneToOne
    private SkillEntity skillEntity;

    @OneToMany
    private List<AbilityEntity> abilityEntityList;

    @OneToMany
    private List<EquipmentEntity> inventoryEntities;

}

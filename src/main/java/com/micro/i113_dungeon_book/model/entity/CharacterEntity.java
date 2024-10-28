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
    @JoinColumn(name = "skills_id", referencedColumnName = "id")
    private SkillEntity skillEntity;

    @OneToMany(mappedBy="id")
    private List<AbilityEntity> abilityEntityList;

    @OneToMany(mappedBy="id")
    private List<EquipmentEntity> equipmentEntities;

}

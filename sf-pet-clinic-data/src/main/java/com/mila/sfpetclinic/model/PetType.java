package com.mila.sfpetclinic.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "types")
public class PetType extends BaseEntity {
    @Column(name = "name")
    private String name;
    @Override
    public String toString() {
        return name;
    }
    @Builder
    public PetType(Long id, String name) {
        super(id);
        this.name = name;
    }
}

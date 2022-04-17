package com.uygulama.ecdemo.entity;

import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Table(name = "animals")
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
public class Animal extends Object {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "species")
    private String species;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private int age;


    @Column(name = "description")
    private String description;

    @ManyToOne()
    @JoinColumn(name = "animal_owner_id", nullable=false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private AnimalOwner animalOwner;

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", species='" + species + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", description='" + description + '\''
                ;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public AnimalOwner getAnimalOwner() {
        return animalOwner;
    }

    public void setAnimalOwner(AnimalOwner animalOwner) {
        this.animalOwner = animalOwner;
    }
}

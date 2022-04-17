package com.uygulama.ecdemo.repository;

import com.uygulama.ecdemo.entity.Animal;
import com.uygulama.ecdemo.entity.AnimalOwner;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IAnimalRepository extends CrudRepository<Animal,Integer> {

    @Query(value="select s from Animal s where s.name like %?1%")
    Optional<List<Animal>> getByName(String animalName);
}

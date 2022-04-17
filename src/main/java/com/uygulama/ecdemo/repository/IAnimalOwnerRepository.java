package com.uygulama.ecdemo.repository;

import com.uygulama.ecdemo.entity.AnimalOwner;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IAnimalOwnerRepository extends CrudRepository<AnimalOwner,Integer> {

    @Query(value="select s from AnimalOwner s where s.firstName like %?1%")
    Optional<List<AnimalOwner>> getByFirstName( String animalOwnerName);
}

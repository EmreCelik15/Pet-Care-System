package com.uygulama.ecdemo;

import com.uygulama.ecdemo.entity.AnimalOwner;
import com.uygulama.ecdemo.repository.IAnimalOwnerRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import java.util.List;
import java.util.Optional;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class AnimalOwnerRepositoryTest {

    @Autowired
    private IAnimalOwnerRepository repo;

    @Test
    public void testAddNew(){
        AnimalOwner animalOwner=new AnimalOwner();
        animalOwner.setEmail("exam@gmail.com");
        animalOwner.setFirstName("Emre");
        animalOwner.setLastName("Çelik");
        animalOwner.setMobilePhone(54777);
        AnimalOwner savedAnimalOwner=repo.save(animalOwner);

        Assertions.assertThat(savedAnimalOwner).isNotNull();
        Assertions.assertThat(savedAnimalOwner.getId()).isGreaterThan(0);
    }

    @Test
    public void testListAll(){
        Iterable<AnimalOwner> animalOwners=repo.findAll();
        Assertions.assertThat(animalOwners).hasSizeGreaterThan(0);
        for (AnimalOwner animalOwner : animalOwners){
            System.out.println(animalOwner);
        }
    }

    @Test
    public void testUpdate(){
        int id=2;
        Optional<AnimalOwner> optionalAnimalOwner = repo.findById(id);
        AnimalOwner animalOwner =optionalAnimalOwner.get();
        animalOwner.setMobilePhone(1111111);
        repo.save(animalOwner);

        AnimalOwner updatedAnimalOwner=repo.findById(id).get();
        Assertions.assertThat(updatedAnimalOwner.getMobilePhone()).isEqualTo(1111111);

    }

    @Test
    public void testGet(){
        int id=2;
        Optional<AnimalOwner> optionalAnimalOwner = repo.findById(id);
        Assertions.assertThat(optionalAnimalOwner).isPresent();
        System.out.println(optionalAnimalOwner.get());
    }
    @Test
    public void testDelete(){
        int id=27;
        repo.deleteById(id);
        Optional<AnimalOwner> optionalAnimalOwner = repo.findById(id);
        Assertions.assertThat(optionalAnimalOwner).isEmpty();
    }
    @Test
    public void testGetByName(){
        String name="Ahmet";
        Optional<List<AnimalOwner>> optionalAnimalOwner = repo.getByFirstName(name);
        Assertions.assertThat(optionalAnimalOwner).isPresent();
        System.out.println(optionalAnimalOwner.get());
    }

}

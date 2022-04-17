package com.uygulama.ecdemo;

import com.uygulama.ecdemo.entity.Animal;
import com.uygulama.ecdemo.entity.AnimalOwner;
import com.uygulama.ecdemo.repository.IAnimalRepository;
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
public class AnimalRepositoryTest {

    @Autowired
    IAnimalRepository repo;

    @Test
    public void testAddNew(){
        AnimalOwner animalOwner=new AnimalOwner();
        animalOwner.setId(2);
        animalOwner.setFirstName("Ahmet");
        animalOwner.setLastName("Bir");
        animalOwner.setMobilePhone(1111111);
        animalOwner.setEmail("ahmet@gmail.com");

        Animal animal=new Animal();
        animal.setAge(15);
        animal.setName("Tavuk");
        animal.setSpecies("Kuşgiller");
        animal.setDescription("Evcil");
        animal.setAnimalOwner(animalOwner);

        Animal savedAnimal=repo.save(animal);

        Assertions.assertThat(savedAnimal).isNotNull();
        Assertions.assertThat(savedAnimal.getId()).isGreaterThan(0);
    }

    @Test
    public void testListAll(){
        Iterable<Animal> animals=repo.findAll();
        Assertions.assertThat(animals).hasSizeGreaterThan(0);
        for (Animal animal : animals){
            System.out.println(animal);
        }
    }

    @Test
    public void testUpdate(){
        int id=29;
        Optional<Animal> optionalAnimal = repo.findById(id);
        Animal animal =optionalAnimal.get();
        animal.setAge(10);
        repo.save(animal);

        Animal updatedAnimal=repo.findById(id).get();
        Assertions.assertThat(updatedAnimal.getAge()).isEqualTo(10);

    }

    @Test
    public void testGet(){
        int id=26;
        Optional<Animal> optionalAnimal = repo.findById(id);
        Assertions.assertThat(optionalAnimal).isPresent();
        System.out.println(optionalAnimal.get());
    }
    @Test
    public void testDelete(){
        int id=26;
        repo.deleteById(id);
        Optional<Animal> optionalAnimal = repo.findById(id);
        Assertions.assertThat(optionalAnimal).isEmpty();
    }
    @Test
    public void testGetByName(){
        String name="Kedi";
        Optional<List<Animal>> optionalAnimal = repo.getByName(name);
        Assertions.assertThat(optionalAnimal).isPresent();
        System.out.println(optionalAnimal.get());
    }
}

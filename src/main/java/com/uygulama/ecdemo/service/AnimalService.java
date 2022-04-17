package com.uygulama.ecdemo.service;

import com.uygulama.ecdemo.entity.Animal;
import com.uygulama.ecdemo.entity.AnimalOwner;
import com.uygulama.ecdemo.repository.IAnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnimalService {

    private IAnimalRepository animalRepository;

    @Autowired
    public AnimalService(IAnimalRepository animalRepository) {
        super();
        this.animalRepository = animalRepository;
    }

    public Optional<List<Animal>> getByAnimalName(String animalName) {
        return this.animalRepository.getByName(animalName);
    }

    public List<Animal> getByAll() {

        return (List<Animal>) this.animalRepository.findAll();
    }
    public Optional<Animal> getById(Integer id) {

        Optional<Animal> animal=animalRepository.findById(id);
        return animal;
    }

    public String add(Animal animal) {
        this.animalRepository.save(animal);
        return "Eklendi.";
    }


    public String delete(int id) {
        Optional<Animal> animalOptional = animalRepository.findById(id);
        if (animalOptional.isEmpty()) {
            return "Böyle bir hayvan yoktur.";
        }
        animalRepository.delete(animalOptional.get());
        return "Silindi.";
    }


}

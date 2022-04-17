package com.uygulama.ecdemo.service;


import com.uygulama.ecdemo.entity.Animal;
import com.uygulama.ecdemo.entity.AnimalOwner;
import com.uygulama.ecdemo.repository.IAnimalOwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class AnimalOwnerService {


    private IAnimalOwnerRepository animalOwnerRepository;

    @Autowired
    public AnimalOwnerService(IAnimalOwnerRepository animalOwnerRepository) {
        super();
        this.animalOwnerRepository = animalOwnerRepository;
    }


    public Optional<List<AnimalOwner>> getByFirstName(String animalOwnerName) {
        return this.animalOwnerRepository.getByFirstName(animalOwnerName);
    }

    public List<AnimalOwner> getByAll() {
        return (List<AnimalOwner>) this.animalOwnerRepository.findAll();
    }

    public String add(AnimalOwner animalOwner) {
        this.animalOwnerRepository.save(animalOwner);
        return "Eklendi.";
    }


    public String delete(int id) {
        Optional<AnimalOwner> animalOptional = animalOwnerRepository.findById(id);
        if (animalOptional.isEmpty()) {
            return "Böyle bir hayvan sahibi yoktur.";
        }
        animalOwnerRepository.delete(animalOptional.get());
        return "Silindi.";

    }
    public Optional<AnimalOwner> getById(Integer id) {

        Optional<AnimalOwner> animalOwner=animalOwnerRepository.findById(id);
        return animalOwner;
    }


}

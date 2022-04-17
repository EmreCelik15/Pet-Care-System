package com.uygulama.ecdemo.controller;

import com.uygulama.ecdemo.entity.Animal;
import com.uygulama.ecdemo.entity.AnimalOwner;
import com.uygulama.ecdemo.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
// @RequestMapping("/api")
public class AnimalsController {

    private AnimalService animalService;

    @Autowired
    public AnimalsController(AnimalService animalService) {
        super();
        this.animalService = animalService;
    }

    @RequestMapping(value = "/animals", method = RequestMethod.GET)
    public String getAll(Model model) {
        List<Animal> animalList = this.animalService.getByAll();
        model.addAttribute("animalList", animalList);
        return "animals";
    }

    @GetMapping("/denemee")
    public String getByName(@RequestParam(value = "name", required = false) String name, Model model) {
        List<Animal> animalList = this.animalService.getByAll();
        model.addAttribute("name", name);
        if (name != null) {
            Optional<List<Animal>> animalList2 = this.animalService.getByAnimalName(name);
            animalList2.ifPresent(o -> model.addAttribute("animalList", o));
        } else {
            model.addAttribute("animalList", animalList);
        }

        return "animals";
    }


    @GetMapping("/animals/new")
    public String getAnimal(Model model) {
        model.addAttribute("animal", new Animal());
        return "animals_form";
    }

    @PostMapping("/animals/add")
    public String add(Animal animal) {
        animalService.add(animal);
        return "redirect:/animals";
    }

    @GetMapping("/animal/delete/{id}")
    public String delete(@PathVariable Integer id, Model model) {
        Optional<Animal> animal = animalService.getById(id);
        animalService.delete(id);
        model.addAttribute("animal", animal);
        return "redirect:/animals";
    }


    @GetMapping("/animals/update/{id}")
    public String update(@PathVariable("id") int id, Model model) {
        Optional<Animal> animal = animalService.getById(id);
        model.addAttribute("animal", animal);
        return "animals_form";
        //try catch adding;
    }
}

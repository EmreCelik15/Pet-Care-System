package com.uygulama.ecdemo.controller;


import com.uygulama.ecdemo.entity.AnimalOwner;
import com.uygulama.ecdemo.service.AnimalOwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@Controller
public class AnimalOwnersController {

    private final AnimalOwnerService animalOwnerService;

    @Autowired
    public AnimalOwnersController(AnimalOwnerService animalOwnerService) {
        super();
        this.animalOwnerService = animalOwnerService;
    }

    @GetMapping("/animalowners")
    public String getAll(Model model) {
        List<AnimalOwner> animalOwnerList = this.animalOwnerService.getByAll();
        model.addAttribute("animalOwnerList", animalOwnerList);
        return "/animalowners";
    }

    @GetMapping("/animalowners/new")
    public String getAnimalOwner(Model model) {
        model.addAttribute("animalOwner", new AnimalOwner());
        return "animalowners_form";
    }

    @PostMapping("/animalowners/add")
    public String add(AnimalOwner animalOwner) {

        animalOwnerService.add(animalOwner);
        return "redirect:/animalowners";
    }

    @GetMapping("/animalowners/delete/{id}")
    public String delete(@PathVariable Integer id, Model model) {
        Optional<AnimalOwner> animal = animalOwnerService.getById(id);
        animalOwnerService.delete(id);
        model.addAttribute("animalOwner", animal);
        return "redirect:/animalowners";
    }

    @GetMapping("/animalowners/update/{id}")
    public String update(@PathVariable("id") int id, Model model) {
        Optional<AnimalOwner> animalOwner = animalOwnerService.getById(id);
        model.addAttribute("animalOwner", animalOwner);
        return "animalowners_form";
        //try catch adding;
    }


    @GetMapping("/animalowners/getbyname")
    public String getByName(@RequestParam(value = "name", required = false) String name, Model model) {
        List<AnimalOwner> animalOwnerList = this.animalOwnerService.getByAll();
        model.addAttribute("name", name);
        if (name != null) {
            Optional<List<AnimalOwner>> animalOwnerLİst2 = this.animalOwnerService.getByFirstName(name);
            animalOwnerLİst2.ifPresent(o -> model.addAttribute("animalOwnerList", o));
        } else {
            model.addAttribute("animalOwnerList", animalOwnerList);
        }

        return "animalowners";
    }


}

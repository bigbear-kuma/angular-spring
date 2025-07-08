package com.example.demo.controller;

import com.example.demo.entity.Hero;
import com.example.demo.service.HeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/heroes")
@CrossOrigin(origins = "http://localhost:4200")
public class HeroController {
    @Autowired
    private HeroService heroService;

    @GetMapping
    public List<Hero> all() {
        return heroService.findAll();
    }

    @GetMapping("/{id}")
    public Hero one(@PathVariable Long id) {
        return heroService.find(id);
    }

    @PostMapping
    public Hero create(@RequestBody Hero hero) {
        return heroService.create(hero);
    }

    @PutMapping("/{id}")
    public Hero update(@RequestBody Hero hero, @PathVariable Long id) {
        return heroService.update(id, hero);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        heroService.delete(id);
    }
}

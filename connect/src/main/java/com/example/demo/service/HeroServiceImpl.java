package com.example.demo.service;

import com.example.demo.entity.Hero;
import com.example.demo.repository.HeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HeroServiceImpl implements HeroService {
    @Autowired
    private HeroRepository heroRepository;

    @Override
    public List<Hero> findAll() {
        return heroRepository.findAll();
    }

    @Override
    public Hero find(Long id) {
        Optional<Hero> hero = heroRepository.findById(id);
        return hero.orElse(null);
    }

    @Override
    public Hero create(Hero hero) {
        return heroRepository.save(hero);
    }

    @Override
    public Hero update(Long id, Hero hero) {
        hero.setId(id);
        return heroRepository.save(hero);
    }

    @Override
    public void delete(Long id) {
        heroRepository.deleteById(id);
    }
}

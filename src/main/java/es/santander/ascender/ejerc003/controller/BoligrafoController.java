package es.santander.ascender.ejerc003.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import es.santander.ascender.ejerc003.model.Boligrafo;
import es.santander.ascender.ejerc003.service.BoligrafoService;

@RestController
@RequestMapping("/api/boligrafo")
public class BoligrafoController {
    @Autowired
    BoligrafoService bs;

    @PostMapping
    public void create(@RequestBody Boligrafo boligrafo) {
        bs.crear(boligrafo);
    }
    @GetMapping
    public List <Boligrafo> readAll() {
        return bs.readAll();
    }
    @GetMapping("/{id}")
    public Boligrafo read(@PathVariable ("id") Long id) {
        return bs.read(id);
    }
    @PutMapping
    public void update(@RequestBody Boligrafo boligrafo) {
        bs.update(boligrafo);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        bs.delete(id);
    }

}

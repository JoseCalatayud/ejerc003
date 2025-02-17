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

import es.santander.ascender.ejerc003.model.Ordenador;
import es.santander.ascender.ejerc003.service.OrdenadorService;

@RestController
@RequestMapping("/api/ordenador")
public class OrdenadorController {

    @Autowired
    OrdenadorService os;

    @PostMapping 
    public void create(@RequestBody Ordenador ordenador) {
        os.crear(ordenador);
    }

    @GetMapping ("/{id}")
    public Ordenador read(@PathVariable("id") Long id) {
        return os.read(id);
    }

    @GetMapping
    public List<Ordenador> readAll() {
        return os.readAll();
    }

    @PutMapping 
    public void update(@RequestBody Ordenador ordenador) {
        os.update(ordenador);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        os.delete(id);
    }


}

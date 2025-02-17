package es.santander.ascender.ejerc003.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.santander.ascender.ejerc003.model.Ordenador;
import es.santander.ascender.ejerc003.repository.OrdenadorRepository;

@Service
public class OrdenadorService {

    @Autowired
    OrdenadorRepository or;

    public void crear(Ordenador ordenador) {
        or.save(ordenador);
    }

    public List<Ordenador> readAll() {
        return or.findAll();
    }

    public Ordenador read(Long id) {
        return or.findById(id).get();
    }

    public void update(Ordenador ordenador) {
        or.save(ordenador);
    }

    public void delete(Long id) {
        or.deleteById(id);
    }
}

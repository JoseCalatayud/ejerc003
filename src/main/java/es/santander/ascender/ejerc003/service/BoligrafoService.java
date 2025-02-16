package es.santander.ascender.ejerc003.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.santander.ascender.ejerc003.model.Boligrafo;
import es.santander.ascender.ejerc003.repository.BoligrafoRepository;

@Service
public class BoligrafoService {

    @Autowired
    BoligrafoRepository br;

    public void crear (Boligrafo boligrafo) {
        br.save(boligrafo);
    }

    public List<Boligrafo> readAll () {
        return br.findAll();
    }

    public Boligrafo read (Long id) {
        return br.findById(id).get();
    }
    
    public void update (Boligrafo boligrafo) {
        br.save(boligrafo);
    }

    public void delete (Long id) {
        br.deleteById(id);
    }


}

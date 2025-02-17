package es.santander.ascender.ejerc003.repository;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import es.santander.ascender.ejerc003.model.Boligrafo;
import jakarta.transaction.Transactional;




@SpringBootTest
public class BoligrafoRepositoryTest {
    
    Boligrafo boligrafo;

    
    @Autowired
    BoligrafoRepository r;

    @BeforeEach
    void setUp() {
        boligrafo = new Boligrafo(160, "Papermate", true);
        r.deleteAll();
        
    }

    @Test
    void TestLeer() {
        r.count();
    }

    @Test()
    public void TestCrear() {
        
        r.save(boligrafo);
        assertTrue(r
                .findById(boligrafo.getId())
                .isPresent());
    }
    @Test
    public void TestListar(){
        r.save(boligrafo);
        assertTrue(r.findAll().size()>=0);

    }

    @Test
    public void TestDelete(){        
        r.save(boligrafo);
        assertTrue(r.findById(1l).get().getId()==1l);
        r.deleteById(1l);
        assertTrue(r.findById(1l).isEmpty());
    };


    @Test
    @Transactional
    public void TestModificar(){
        r.save(boligrafo);
        Boligrafo b1 = r.findById(1l).get();
        assertTrue(b1.getNombre()=="Papermate");
        
        boligrafo.setId(1l);
        boligrafo.setNombre("Montblac");
        r.save(boligrafo);
        assertTrue(r.findAll().size()==1);
        assertTrue(r.findById(1L).get().getNombre()=="Montblac");



        

    }
}

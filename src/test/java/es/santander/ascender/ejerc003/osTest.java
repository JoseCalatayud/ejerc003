package es.santander.ascender.ejerc003;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.NoSuchElementException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import es.santander.ascender.ejerc003.model.Ordenador;
import es.santander.ascender.ejerc003.service.OrdenadorService;
@SpringBootTest
public class osTest {
    Ordenador o;

    @Autowired
    private OrdenadorService os;

    @BeforeEach
    void setUp() {
        o = new Ordenador();
    }
    
    @Test
    void testCreate() {
        
        o.setTeclas(61);
        o.setColor((short)100, (short)50, (short)150);
        o.setIntel(true);
        o.setPeso(1200);
        
        os.crear(o);
        
        List<Ordenador> lista = os.readAll();
        assertFalse(lista.isEmpty());
    }

    @Test
    void testUpdate() {
        
        o.setTeclas(10);
        os.crear(o);

        Ordenador guardado = os.readAll().get(0);
        guardado.setTeclas(99);
        os.update(guardado);

        Ordenador modificado = os.readAll().get(0);
        assertEquals(99, modificado.getTeclas());
    }

    @Test
    void testDelete() {
        
        os.crear(o);
        long id = os.readAll().get(0).getId();    
        assertTrue(os.read(id)!=null); 
        os.delete(id);
        assertThrows(NoSuchElementException.class, () -> os.read(id));  
        
    }
}

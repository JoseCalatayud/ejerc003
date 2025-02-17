package es.santander.ascender.ejerc003.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.santander.ascender.ejerc003.model.Ordenador;

@Repository
public interface OrdenadorRepository extends JpaRepository<Ordenador, Long> {

}

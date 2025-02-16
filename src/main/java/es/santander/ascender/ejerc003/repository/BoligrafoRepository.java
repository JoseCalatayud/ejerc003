package es.santander.ascender.ejerc003.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.santander.ascender.ejerc003.model.Boligrafo;

@Repository
public interface BoligrafoRepository extends JpaRepository<Boligrafo, Long> {

}

package Dao;

import Domain.Peliculas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeliculasDao extends JpaRepository<Peliculas, Integer> {
    Peliculas findByTitulo(String titulo);
}

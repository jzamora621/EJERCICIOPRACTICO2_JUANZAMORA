package Dao;

import Domain.Funciones;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionesDao extends JpaRepository<Funciones, Integer> {
    Funciones findBySala(String sala);
    Funciones findByPeliculaId(int peliculaId);
}

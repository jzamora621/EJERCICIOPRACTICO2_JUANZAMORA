package Service;

import Domain.Peliculas;
import java.util.List;

public interface PeliculasService {
    List<Peliculas> listar();
    Peliculas buscarPorId(int id);
    Peliculas buscarPorTitulo(String titulo);
    void guardar(Peliculas pelicula);
    void eliminar(int id);
}

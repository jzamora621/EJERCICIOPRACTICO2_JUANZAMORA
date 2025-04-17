package Service;

import Domain.Funciones;
import java.util.List;

public interface FuncionesService {
    List<Funciones> listar();
    Funciones buscarPorId(int id);
    Funciones buscarPorSala(String sala);
    Funciones buscarPorPeliculaId(int peliculaId);
    void guardar(Funciones funcion);
    void eliminar(int id);
}

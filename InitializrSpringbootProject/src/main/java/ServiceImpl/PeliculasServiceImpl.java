package ServiceImpl;

import Dao.PeliculasDao;
import Domain.Peliculas;
import Service.PeliculasService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PeliculasServiceImpl implements PeliculasService {

    private final PeliculasDao peliculasDao;

    public PeliculasServiceImpl(PeliculasDao peliculasDao) {
        this.peliculasDao = peliculasDao;
    }

    @Override
    public List<Peliculas> listar() {
        return peliculasDao.findAll();
    }

    @Override
    public Peliculas buscarPorId(int id) {
        return peliculasDao.findById(id).orElse(null);
    }

    @Override
    public Peliculas buscarPorTitulo(String titulo) {
        return peliculasDao.findByTitulo(titulo);
    }

    @Override
    public void guardar(Peliculas pelicula) {
        peliculasDao.save(pelicula);
    }

    @Override
    public void eliminar(int id) {
        peliculasDao.deleteById(id);
    }
}

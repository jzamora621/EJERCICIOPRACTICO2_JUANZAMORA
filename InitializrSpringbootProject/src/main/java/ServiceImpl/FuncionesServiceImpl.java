package ServiceImpl;

import Dao.FuncionesDao;
import Domain.Funciones;
import Service.FuncionesService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FuncionesServiceImpl implements FuncionesService {

    private final FuncionesDao funcionesDao;

    public FuncionesServiceImpl(FuncionesDao funcionesDao) {
        this.funcionesDao = funcionesDao;
    }

    @Override
    public List<Funciones> listar() {
        return funcionesDao.findAll();
    }

    @Override
    public Funciones buscarPorId(int id) {
        return funcionesDao.findById(id).orElse(null);
    }

    @Override
    public Funciones buscarPorSala(String sala) {
        return funcionesDao.findBySala(sala);
    }

    @Override
    public Funciones buscarPorPeliculaId(int peliculaId) {
        return funcionesDao.findByPeliculaId(peliculaId);
    }

    @Override
    public void guardar(Funciones funcion) {
        funcionesDao.save(funcion);
    }

    @Override
    public void eliminar(int id) {
        funcionesDao.deleteById(id);
    }
}

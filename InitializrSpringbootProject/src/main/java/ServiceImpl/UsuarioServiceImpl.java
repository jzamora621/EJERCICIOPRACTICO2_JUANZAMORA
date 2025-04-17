package ServiceImpl;

import Dao.UsuarioDao;
import Domain.Usuario;
import Service.UsuarioService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    private final UsuarioDao usuarioDao;

    public UsuarioServiceImpl(UsuarioDao usuarioDao) {
        this.usuarioDao = usuarioDao;
    }

    @Override
    public List<Usuario> listar() {
        return usuarioDao.findAll();
    }

    @Override
    public Usuario buscarPorId(int id) {
        return usuarioDao.findById(id).orElse(null);
    }

    @Override
    public Usuario buscarPorCorreo(String correo) {
        return usuarioDao.findByCorreo(correo);
    }

    @Override
    public void guardar(Usuario usuario) {
        usuarioDao.save(usuario);
    }

    @Override
    public void eliminar(int id) {
        usuarioDao.deleteById(id);
    }
}

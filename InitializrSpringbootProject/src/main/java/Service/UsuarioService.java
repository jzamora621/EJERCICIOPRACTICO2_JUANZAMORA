/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import Domain.Usuario;
import java.util.List;

public interface UsuarioService {
    List<Usuario> listar();
    Usuario buscarPorId(int id);
    Usuario buscarPorCorreo(String correo);
    void guardar(Usuario usuario);
    void eliminar(int id);
}
    

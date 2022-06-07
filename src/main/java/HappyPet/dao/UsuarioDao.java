package HappyPet.dao;

import HappyPet.models.Usuario;

import java.util.List;

public interface UsuarioDao {

    List<Usuario> getUsuarios();

    void delete( Integer id);

    Usuario getUsuario(Integer id);

    void post(Usuario usuario);

    Usuario obtenerUsuariosPorCredenciales(Usuario usuario);
}

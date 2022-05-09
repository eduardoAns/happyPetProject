package HappyPet.dao;

import HappyPet.models.Usuario;

import java.util.List;

public interface UsuarioDao {

    List<Usuario> getUsuarios();

    void delete( String id);

    void post(Usuario usuario);
}

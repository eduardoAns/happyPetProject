package HappyPet.dao;

import HappyPet.models.Usuario;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;


@Repository
@Transactional

public class UsuarioDaoImp implements UsuarioDao{

    private EntityManager entityManager;

    @Override
    public List<Usuario> getUsuarios() {
        String query = "FROM Usuario";
        return entityManager.createQuery(query).getResultList();

    }

    @Override
    public void delete(String id) {

        Usuario usuario = entityManager.find(Usuario.class ,id);
        entityManager.remove(usuario);
    }

    @Override
    public void post(Usuario usuario) {
        entityManager.merge(usuario);
    }
}

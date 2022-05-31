package HappyPet.dao;

import HappyPet.models.Usuario;
import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


@Repository
@Transactional
public class UsuarioDaoImp implements UsuarioDao{

    @PersistenceContext
    EntityManager entityManager;

    @Override
    @Transactional
    public List<Usuario> getUsuarios() {
        String query = "FROM Usuario ";
        return entityManager.createQuery(query).getResultList();

    }




    @Override
    public void delete(Integer id) {

        Usuario usuario = entityManager.find(Usuario.class ,id);
        entityManager.remove(usuario);
    }

    @Override
    public void post(Usuario usuario) {
        entityManager.merge(usuario);
    }

    @Override
    public Usuario obtenerUsuariosPorCredenciales(Usuario usuario) {
        String query ="FROM Usuario WHERE correo = :correo AND password = :password ";
        List<Usuario> lista = entityManager.createQuery(query)
                .setParameter("correo", usuario.getCorreo())
                .setParameter("password", usuario.getPassword())
                .getResultList();

        if(lista.isEmpty()){
            return null;
        }


        return lista.get(0);

    }

}


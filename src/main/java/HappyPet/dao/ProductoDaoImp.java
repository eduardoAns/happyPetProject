package HappyPet.dao;

import HappyPet.models.Imagen;
import HappyPet.models.Producto;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.stream.Collectors;

@Repository
@Transactional
public class ProductoDaoImp implements ProductoDao{

    @PersistenceContext
    EntityManager entityManager;


    @Override
    @Transactional
    public List<Producto> getProductos() {
        String query = "FROM Producto";
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public Producto getProductoId(Integer id) {
        String query = "FROM Producto WHERE id = :id";
        List<Producto> lista = entityManager.createQuery(query).setParameter("id", id).getResultList();
        return lista.get(0);
    }


    @Override
    public List<Producto> getProductosByType(String type) {
        List<Producto> listaType = getProductos();
        //return response;
        return listaType;
    }


    @Override
    public List<Producto> getProductosByTitle(String title) {
        List<Producto> listaTitle = getProductos();
        List<Producto> response = listaTitle.stream().filter(p -> p.getTitle().contains(title)).collect(Collectors.toList());
        return response;
    }

    @Override
    @Transactional
    public void post(Producto producto, List<Imagen> imagen) {
        entityManager.merge(producto);
        /*
        entityManager.merge(imagen.get(0));
        entityManager.merge(imagen.get(1));
        */
    }



}
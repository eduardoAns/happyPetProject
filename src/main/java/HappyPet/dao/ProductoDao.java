package HappyPet.dao;

import HappyPet.models.Producto;

import java.util.List;

public interface ProductoDao {

    List<Producto> getProductos();

    Producto getProducto(Integer id);

    void delete( Integer id);

    void post(Producto producto);
}

package HappyPet.dao;

import HappyPet.models.Imagen;
import HappyPet.models.Producto;

import java.util.List;

public interface ProductoDao {
    List<Producto> getProductos();

    Producto getProductoId(Integer id);

    List<Producto> getProductosByType(String type);

    List<Producto> getProductosByTitle(String title);

    void post(Producto producto, List<Imagen> imagen);
}

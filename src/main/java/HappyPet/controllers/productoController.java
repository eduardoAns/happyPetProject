package HappyPet.controllers;

import HappyPet.models.Producto;
import HappyPet.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class productoController {

    @RequestMapping(value="api/producto" , method = RequestMethod.GET)
    public Producto getProductos(){



        Producto producto = new Producto();
        producto.setId(001);
        producto.setDescription("descripcion001");
        producto.setImages(new String[]{"imagen01", "imagen02"});
        producto.setStock(10);
        producto.setPrice(10990);
        producto.setSize("xl");
        producto.setSlug("detalleproducto");
        producto.setTags(new String[]{"tag01", "tag02"});
        producto.setTitle("nombreProducto");
        producto.setType("juguete");
        producto.setGender("unisex");

        return producto;
    }
}

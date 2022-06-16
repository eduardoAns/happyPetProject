package HappyPet.controllers;
import HappyPet.dao.ProductoDao;
import HappyPet.models.Imagen;
import HappyPet.models.Producto;
import HappyPet.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST} )
public class productoController {

    @Autowired
    private ProductoDao productoDao;


    @RequestMapping(value="api/producto/{id}" , method = RequestMethod.GET)
    public Producto getProducto(@PathVariable Integer id){
        return productoDao.getProductoId(id);
    }

    @RequestMapping(value = "api/producto", method = RequestMethod.GET)
    public List<Producto> getProductos(){
        return productoDao.getProductos();
    }

    @RequestMapping(value="api/producto/tipo/{type}" , method = RequestMethod.GET)
    public List<Producto> getProductosType(@PathVariable String type){ return  productoDao.getProductosByType(type); }

    @RequestMapping(value="api/producto/nombre/{title}" , method = RequestMethod.GET)
    public List<Producto> getProductosTitle(@PathVariable String title){ return  productoDao.getProductosByTitle(title); }

    @RequestMapping(value="api/producto", method = RequestMethod.POST)
    public void PostUsuario(@RequestBody Producto producto){
        List<Imagen> lista = producto.getImages();
        Producto productoFiltrado = new Producto();
        productoFiltrado.setDescription(producto.getDescription());
        productoFiltrado.setInStock(producto.getInStock());
        productoFiltrado.setPrice(producto.getPrice());
        productoFiltrado.setSizes(producto.getSizes());
        productoFiltrado.setTags(producto.getTags());
        productoFiltrado.setTitle(producto.getTitle());
        productoFiltrado.setType(producto.getType());
        productoFiltrado.setGender(producto.getGender());
        productoFiltrado.setDate(producto.getDate());

        System.out.println(lista);
        System.out.println(productoFiltrado);
        productoDao.post(productoFiltrado, lista);
    }

}
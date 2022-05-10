package HappyPet.controllers;
import HappyPet.dao.UsuarioDao;
import HappyPet.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST} )
public class usuarioController {

    @Autowired
    private UsuarioDao usuarioDao;

    @RequestMapping(value="api/usuario", method = RequestMethod.GET)
    public List<Usuario> getUsuarios(){

        return usuarioDao.getUsuarios();

    }

    @RequestMapping(value="api/usuario/{id}" , method = RequestMethod.GET)
    public Usuario getUsuario(@PathVariable String id){
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("eduardo");
        usuario.setApellido("ansa");
        usuario.setCorreo("email@email.com");
        usuario.setPassword("12345");
        usuario.setRol("administrador");
        usuario.setFechaCreacion("07/05/2022");
        return usuario;
    }



    @RequestMapping(value="api/usuario", method = RequestMethod.POST)
    public void PostUsuario(@RequestBody Usuario usuario){
        usuarioDao.post(usuario);
    }

    @RequestMapping(value="api/usuario/{id}", method = RequestMethod.DELETE)
    public void deleteUsuario(@PathVariable String id){
        usuarioDao.delete(id);
    }



}

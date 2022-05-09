package HappyPet.controllers;
import HappyPet.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class usuarioController {

    @RequestMapping(value="usuario/{id}")
    public Usuario getUsuario(@PathVariable String id){
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("eduardo");
        usuario.setApellido("ansa");
        usuario.setEmail("email@email.com");
        usuario.setPassword("12345");
        usuario.setRol("administrador");
        usuario.setFechaCreacion("07/05/2022");
        return usuario;
    }

    @RequestMapping(value="usuario")
    public Usuario getUsuarios(){
        Usuario usuario = new Usuario();
        usuario.setNombre("eduardo");
        usuario.setApellido("ansa");
        usuario.setEmail("email@email.com");
        usuario.setPassword("12345");
        usuario.setRol("administrador");
        usuario.setFechaCreacion("07/05/2022");
        return usuario;
    }

    @RequestMapping(value="usuario/post")
    public Usuario PostUsuario(){
        Usuario usuario = new Usuario();
        usuario.setNombre("eduardo");
        usuario.setApellido("ansa");
        usuario.setEmail("email@email.com");
        usuario.setPassword("12345");
        usuario.setRol("administrador");
        usuario.setFechaCreacion("07/05/2022");
        return usuario;
    }
    @RequestMapping(value="usuario/delete")
    public Usuario deleteUsuario(){
        Usuario usuario = new Usuario();
        usuario.setNombre("eduardo");
        usuario.setApellido("ansa");
        usuario.setEmail("email@email.com");
        usuario.setPassword("12345");
        usuario.setRol("administrador");
        usuario.setFechaCreacion("07/05/2022");
        return usuario;
    }



}

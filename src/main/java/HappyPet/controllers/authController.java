package HappyPet.controllers;

import HappyPet.dao.UsuarioDao;
import HappyPet.models.Usuario;
import HappyPet.utils.JWTUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST} )
public class authController {

    @Autowired
    private UsuarioDao usuarioDao;

    @Autowired
    private JWTUtil jwtUtil;

    @RequestMapping(value = "api/login", method = RequestMethod.POST)

    public Map<String, Map<String, String>> login(@RequestBody Usuario usuario) {

        Usuario usuarioLogueado = usuarioDao.obtenerUsuariosPorCredenciales(usuario);
        String usuarioCorreo = usuarioLogueado.getCorreo();
        String usuarioNombre = usuarioLogueado.getNombre();
        String usuarioRol = usuarioLogueado.getRol();
        Integer usuarioId = usuarioLogueado.getId();


        Map<String, Map<String, String>> map = new HashMap<String, Map<String, String>>();
        Map<String,String> user = new HashMap<String,String>();
        Map<String,String> token = new HashMap<String,String>();
        user.put("correo",usuarioCorreo);
        user.put("rol",usuarioRol);
        user.put("nombre",usuarioNombre);

        if (usuarioLogueado != null){

            String tokenjwt = jwtUtil.create(String.valueOf(usuarioId), usuarioCorreo);
            token.put("jwt", tokenjwt);

            map.put("user", user);
            map.put("token",token);


            return map;
        }

        return map;
    }
}

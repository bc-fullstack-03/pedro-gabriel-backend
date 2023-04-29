package sysmap.project.socialnetwork.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sysmap.project.socialnetwork.model.entities.Usuario;
import sysmap.project.socialnetwork.repositories.UsuarioRepository;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    UsuarioRepository usuarioRepository;
    @RequestMapping("/")
    public String getUsuario(){
        return "Testando";
    }
    @ModelAttribute("usuarioItems")
    public List<Usuario> getUsuarios(){
        return usuarioRepository.findAll();
    }
}

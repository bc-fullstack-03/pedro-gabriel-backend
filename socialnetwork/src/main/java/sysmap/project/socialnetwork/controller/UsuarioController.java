package sysmap.project.socialnetwork.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
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

    @PostMapping("/")
    public Usuario criarUsuario(@RequestBody Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    @ModelAttribute("usuarioItems")
    public List<Usuario> getUsuarios(){
        return usuarioRepository.findAll();
    }





}

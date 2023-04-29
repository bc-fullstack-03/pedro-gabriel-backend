package sysmap.project.socialnetwork.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    @RequestMapping("/")
    public String getUsuario(){
        return "Testando";
    }
}

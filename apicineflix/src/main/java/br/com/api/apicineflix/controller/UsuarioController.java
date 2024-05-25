package br.com.api.apicineflix.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {

    @GetMapping("/cadastro")
    public String texto(){
        return "Acessando a API com sucesso";
        
        // Até aqui tudo tranquilo

    }
}

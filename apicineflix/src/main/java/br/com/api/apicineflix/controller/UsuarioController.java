package br.com.api.apicineflix.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.apicineflix.DAO.IUsuario;
import br.com.api.apicineflix.model.Usuario;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/usuarios") // Mapa de solicitação
public class UsuarioController {
    /*
    A cada método que eu for chamar (Post, Get, Delete)
    eu vou criar um (@PostMapping, @getMapping) e cada um
    desses @ serão um path (/caminho)
    */  

    @Autowired
    private IUsuario dao;
 
    @GetMapping
    public List<Usuario> listaUsuarios(){
        return (List<Usuario>) dao.findAll();
        
        // Até aqui tudo tranquilo
    }

    @PostMapping
    public Usuario postMethodName(@RequestBody Usuario usuario) {
        Usuario usuarioNovo = dao.save(usuario);
        return usuarioNovo;
    }
    
}

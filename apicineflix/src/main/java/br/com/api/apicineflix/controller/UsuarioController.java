package br.com.api.apicineflix.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.apicineflix.DAO.IUsuario;
import br.com.api.apicineflix.model.Usuario;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;


/*
 Quando eu coloco a URL (http://localhost:8080[/path])
 vai sempre chamar o método que está indicado depois do Mapping
 */
@RestController
@CrossOrigin("*")
@RequestMapping("/usuarios") //Mapa de solicitação
public class UsuarioController {
    /*
    A cada método que eu for chamar (Post, Get, Delete)
    eu vou criar um (@PostMapping, @getMapping) e cada um
    desses @ serão um path (/caminho)
    */  

    @Autowired
    private IUsuario dao;
 
    @GetMapping // Metodo GET: Pega todos os usuários cadastrados
    public List<Usuario> listaUsuarios(){
        return (List<Usuario>) dao.findAll();
        
    }

    @PostMapping // método Post
    public Usuario postMethodName(@RequestBody Usuario usuario) {
        Usuario usuarioNovo = dao.save(usuario);
        return usuarioNovo;
    }

    @PutMapping // método Put
    public Usuario editarUsuario(@RequestBody Usuario usuario) {
        Usuario usuarioNovo = dao.save(usuario);
        
        return usuarioNovo;
    }

    @DeleteMapping("/{id}") // método Delete
    public Optional<Usuario> excluirUsuario(@PathVariable int id){
        Optional<Usuario> usuario = dao.findById(id);
        dao.deleteById(id);
        return usuario;
    }
    
}

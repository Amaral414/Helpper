package br.com.api.apicineflix.DAO;

import org.springframework.data.repository.CrudRepository;

import br.com.api.apicineflix.model.Usuario;

public interface IUsuario extends CrudRepository<Usuario, Integer>{

}

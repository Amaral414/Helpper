package br.com.api.apicineflix.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {

    // Indica que o ID é a primary key 
    @Id
    // Faz com que o ID seja gerado automaticamente
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    /*
    Essas linhas em cima dos atributos da classe
    são para identificar a definição delas no BD
    */
    @Column(name = "id")
    private int id;
    
    @Column(name = "nome", length = 200, nullable = true)
    private String nome;
    
    @Column(name = "email", length = 50, nullable = true)
    private String email;
    
    @Column(name = "senha", columnDefinition = "TEXT", nullable = true)
    private String senha;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }

    
}

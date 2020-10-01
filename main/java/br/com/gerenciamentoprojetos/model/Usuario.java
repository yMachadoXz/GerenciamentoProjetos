package br.com.gerenciamentoprojetos.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.Size;

import org.springframework.lang.NonNull;

@Entity(name="usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long nome;

    @NonNull
    @Size(max=50)
    private String login;

    @NonNull
    @Size(max=80)
    private String senha ;

    @NonNull
    @Size(max=80)
    private String CPF ;

    @ManyToMany(mappedBy = "Usuario")
    private List<Projeto> projetos;


    public List<Projeto> getProjetos() {
        return projetos;
    }

    public void setProjetos(List<Projeto> projetos) {
        this.projetos = projetos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getNome() {
        return nome;
    }

    public void setNome(Long id) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String nome) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String Senha) {
        this.senha = senha;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCargo(String CPF) {
        this.CPF = CPF;
    }


}

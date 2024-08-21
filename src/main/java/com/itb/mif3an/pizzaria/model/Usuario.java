package com.itb.mif3an.pizzaria.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    private Long id;
    @Column(nullable = false, length = 100)
    private String nome;
    @Column(nullable = false, length = 11)
    private String cpf;
    @Column(nullable = false, length = 10)
    private String username;
    @Column(nullable = false, length = 250)
    private String password;
    @Column(nullable = false, length = 100)
    private String tipoUsuario;
    @Column(nullable = false, length = 50)
    private String logradouro;
    @Column(nullable = false, length = 8)
    private String cep;
    @Column(nullable = false, length = 20)
    private String bairro;
    @Column(nullable = false, length = 15)
    private String uf;
    private boolean codStatus;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)//cascade é uma reação em cadeia, ao fazer uma acao reflete em todos os produtos
    @JsonIgnore //não permite fazer um looping infinito, pois a categoria puxa o produto e o produto a categoria... entao o ciclo se repete
    private List<Telefone> telefones = new ArrayList<Telefone>();
    //não permite fazer um looping infinito, pois a categoria puxa o produto e o produto a categoria... entao o ciclo se repete


    //Atributos de apoio

    @Transient
    private String mensagemErro = "";
    @Transient
    private boolean isValid  = true;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public boolean isCodStatus() {
        return codStatus;
    }

    public void setCodStatus(boolean codStatus) {
        this.codStatus = codStatus;
    }


    public List<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
    }

    public String getMensagemErro() {
        return mensagemErro;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(id, usuario.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public boolean validarUsuario() {
        return isValid;
    }
}

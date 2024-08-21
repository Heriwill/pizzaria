package com.itb.mif3an.pizzaria.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "categorias")

public class Categoria {

    @Id //PK chave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) //criação automatica das pk
    private Long id;
    //nullable nao aceita nulo (not null) e true aceita
    // length tamanho
    @Column(nullable = false, length = 45)
    private String nome;
    @Column(nullable = true, length = 100)
    private String descricao;
    private boolean codStatus;

    //FK
    @OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)//cascade é uma reação em cadeia, ao fazer uma acao reflete em todos os produtos
    @JsonIgnore //não permite fazer um looping infinito, pois a categoria puxa o produto e o produto a categoria... entao o ciclo se repete
    private List<Produto> produtos = new ArrayList<Produto>();

    //Atributos de apoio
    //@Transient representa um atributo que NAO CORRESPONDE A UMA COLUNA DA TABELA, "É IGNORADO"
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isCodStatus() {
        return codStatus;
    }

    public void setCodStatus(boolean codStatus) {
        this.codStatus = codStatus;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }



    public String getMensagemErro(){
        return mensagemErro;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Categoria categoria = (Categoria) o;
        return Objects.equals(id, categoria.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public boolean validarCategoria(){
        if (nome == null || nome.isEmpty()){
            mensagemErro += "O nome da categoria é obrigatório: ";
            isValid = false;
        }
        return isValid;
    }
}

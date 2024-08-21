package com.itb.mif3an.pizzaria.model;

import javax.persistence.*;

@Entity
@Table(name = "telefones")
public class Telefone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 15)
    private String numero; //pode-se colocar traços, pontos etc

    //relacionando tabelas muitos para um...
    @ManyToOne (cascade = CascadeType.ALL)
    @JoinColumn(name = "usuario_id", referencedColumnName = "id", nullable = false)
    private Usuario usuario;

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

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

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getMensagemErro() {
        return mensagemErro;
    }

    public boolean validarTelefone() {
        return isValid;
    }
}

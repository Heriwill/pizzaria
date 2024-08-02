package com.itb.mif3an.pizzaria.model;

public class Telefone {

    private Long id;
    private String numero; //pode-se colocar traços, pontos etc
    private int idCliente;

    //Atributos de apoio

    private String mensagemErro = "";
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

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getMensagemErro() {
        return mensagemErro;
    }

    public boolean validarTelefone() {
        return isValid;
    }
}

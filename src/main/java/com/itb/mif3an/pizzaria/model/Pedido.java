package com.itb.mif3an.pizzaria.model;

import java.time.LocalDateTime;

public class Pedido {

    private Long id;
    private LocalDateTime dataHoraCompra;
    private LocalDateTime dataHoraEntrega;
    private double valorTotal;
    private String codStatus;
    private Long clienteId;
    private String numeroPedido; //varchar, pois pode combinar letras e numeros

    //Atributos de apoio

    private String mensagemErro = "";
    private boolean isValid  = true;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDataHoraCompra() {
        return dataHoraCompra;
    }

    public void setDataHoraCompra(LocalDateTime dataHoraCompra) {
        this.dataHoraCompra = dataHoraCompra;
    }

    public LocalDateTime getDataHoraEntrega() {
        return dataHoraEntrega;
    }

    public void setDataHoraEntrega(LocalDateTime dataHoraEntrega) {
        this.dataHoraEntrega = dataHoraEntrega;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getCodStatus() {
        return codStatus;
    }

    public void setCodStatus(String codStatus) {
        this.codStatus = codStatus;
    }

    public Long getClienteId() {
        return clienteId;
    }

    public void setClienteId(Long clienteId) {
        this.clienteId = clienteId;
    }

    public String getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(String numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public String getMensagemErro() {
        return mensagemErro;
    }

    public boolean validarPedido() {
        return isValid;
    }
}

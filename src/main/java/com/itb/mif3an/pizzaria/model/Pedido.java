package com.itb.mif3an.pizzaria.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "pedidos")
public class Pedido {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 10)
    private String numeroPedido; //varchar, pois pode combinar letras e numeros
    @Column(nullable = false)
    private LocalDateTime dataHoraCompra;
    @Column(nullable = false)
    private LocalDateTime dataHoraEntrega;
    @Column(nullable = false, columnDefinition = "DECIMAL(5,2)")
    private double valorTotal;
    private String codStatus;
    private boolean status;

    @OneToMany(mappedBy = "produto", cascade = CascadeType.ALL)//cascade é uma reação em cadeia, ao fazer uma acao reflete em todos os produtos
    @JsonIgnore
    //não permite fazer um looping infinito, pois a categoria puxa o produto e o produto a categoria... entao o ciclo se repete
    private List<ItemPedido> itemPedidos = new ArrayList<ItemPedido>();


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

    public List<ItemPedido> getItemPedidos() {
        return itemPedidos;
    }

    public void setItemPedidos(List<ItemPedido> itemPedidos) {
        this.itemPedidos = itemPedidos;
    }



    public void setCodStatus(String codStatus) {
        this.codStatus = codStatus;
    }

    //public Long getClienteId() {
        //return clienteId;
    //}

   // public void setClienteId(Long clienteId) {
       // this.clienteId = clienteId;
    //}

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

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}

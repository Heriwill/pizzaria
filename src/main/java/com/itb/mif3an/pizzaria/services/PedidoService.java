package com.itb.mif3an.pizzaria.services;

import com.itb.mif3an.pizzaria.model.Pedido;

import java.util.List;

public interface PedidoService{

    public List<Pedido> findAll();

    public Pedido save(Pedido pedido);
}

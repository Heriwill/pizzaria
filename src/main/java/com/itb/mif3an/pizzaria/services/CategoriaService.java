package com.itb.mif3an.pizzaria.services;

import com.itb.mif3an.pizzaria.model.Categoria;

import java.util.List;

public interface CategoriaService {
    public List<Categoria> findAll();
    public Categoria save(Categoria categoria);
    public Categoria findById(Long idLong);
}

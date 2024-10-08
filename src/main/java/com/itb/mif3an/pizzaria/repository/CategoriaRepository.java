package com.itb.mif3an.pizzaria.repository;

import com.itb.mif3an.pizzaria.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> { //extends, extensao, filha, herança. Herda códigos prontos jpa
    //interface é um contrato, obrigando a usar parametros passados;

}

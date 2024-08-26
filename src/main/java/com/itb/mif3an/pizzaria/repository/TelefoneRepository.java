package com.itb.mif3an.pizzaria.repository;

import com.itb.mif3an.pizzaria.model.Telefone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TelefoneRepository extends JpaRepository<Telefone, Long> { //extends, extensao, filha, herança. Herda códigos prontos jpa
  //interface é um contrato, obrigando a usar parametros passados;
}

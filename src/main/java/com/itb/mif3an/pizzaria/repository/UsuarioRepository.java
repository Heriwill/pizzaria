package com.itb.mif3an.pizzaria.repository;

import com.itb.mif3an.pizzaria.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    @Query(value = "SELECT * FROM usuarios u WHERE u.username=?", nativeQuery = true) // a ? é uma variavel,  neste contexto ela ainda não é definida pois n sabemos o email etc.
    Usuario findByEmail(String email);

    Usuario findByUsername(String username);
}

package com.itb.mif3an.pizzaria.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfiguration implements WebMvcConfigurer { //permite que outros apps, clientes acessem meus recursos; é necessaria autização para eles acessarem
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") ///** aceita qualquer endpoint
                .allowedMethods("http://localhost:5173")//porta do react no itb
                        .allowedMethods("GET", "POST", "DELETE", "PUT", "OPTIONS", "HEAD", "TRACE", "CONNECT"); //OPTIONS: serve para quais métodos serão aceitos; HEAD: para saber se o programa suporta um arquivo; TRACE: para testar PIN; CONNECT: conecçaõ api
    }
}

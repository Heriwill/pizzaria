package com.itb.mif3an.pizzaria;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.itb.mif3an.pizzaria.model.Produto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PizzariaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PizzariaApplication.class, args);

		Produto p = new Produto();
		//p.precoCompra = -45.00;

		//System.out.println("Preço de compra " + p.precoCompra);

//p.setPrecoCompra(-56.0);
//System.out.println("preço de compra " + p.getPrecoCompra());

 		p.setNome ("Pizza de calabresa tamanho 6");
		p.setPrecoCompra((-56.0));

		if(!p.validarProduto()){
	System.out.println(p.getMensagemErro());
}
      }

}

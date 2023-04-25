package com.unifan.projetovenda;

import com.unifan.projetovenda.entity.Cliente;
import com.unifan.projetovenda.entity.Pedido;
import com.unifan.projetovenda.entity.Pessoa;
import com.unifan.projetovenda.entity.Produto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.Instant;
import java.time.LocalDate;
import java.util.Date;

@SpringBootApplication
public class ProjetoVendaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoVendaApplication.class, args);

		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Douglas");
		pessoa.setEndereco("Rua joão da lapa");
		pessoa.setCidade("Santo antônio");
		pessoa.setEstado("Goiás");
		pessoa.setCep("9831567013");
		pessoa.setRg_ie("653451");
		pessoa.setCelular("62996356193");
		pessoa.setDataNascimento(Date.from(Instant.now()));
		pessoa.setEmail("Dogão@stop.com.br");

		System.out.println(pessoa);

		Produto produto1 = new Produto();
		Produto produto2 = new Produto();

		Pedido pedido = new Pedido();
		pedido.setDataPedido(LocalDate.now());
		pedido.setPessoa(pessoa);
		pedido.setVlrTotal(0.0);
		pedido.setItens();
	}
}


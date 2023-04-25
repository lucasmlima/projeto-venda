package com.unifan.projetovenda.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigInteger;

@Data
@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @Column(name = "quant_estoque")
    private Double quantEstoque;

    @Column(name = "vlr_venda")
    private Double vlrVenda;

    @Column(name = "vlr_custo")
    private Double vlrCusto;

    @Column(name = "nome_produto")
    private String nomeProduto;

    private String unidade;

    private Double peso;

}

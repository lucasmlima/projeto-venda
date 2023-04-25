package com.unifan.projetovenda.entity;

import lombok.Data;

import javax.persistence.Entity;
import java.sql.ClientInfoStatus;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Entity


public class Pedido {

    private LocalDate dataPedido;

    private Double vlrTotal;

    Pessoa pessoa = new Pessoa();

    List<ItemPedido> Itens = new ArrayList<>();

}

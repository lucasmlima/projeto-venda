package com.unifan.projetovenda.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity

public class ItemPedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public double getVlrUnitario() {
        return vlrUnitario;
    }

    public void setVlrUnitario(double vlrUnitario) {
        this.vlrUnitario = vlrUnitario;
    }

    public double getVlrTotalitem() {
        vlrTotalitem = vlrUnitario * quantidade;
        return vlrTotalitem;
    }

    public void setVlrTotalitem(double vlrTotalitem) {
        this.vlrTotalitem = vlrTotalitem;
    }

    Produto produto  = new Produto();

    private double quantidade;

    private double vlrUnitario;

    private double vlrTotalitem;

}

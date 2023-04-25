package com.unifan.projetovenda.service;

import com.unifan.projetovenda.entity.Produto;

import java.util.List;
import java.util.Optional;

public interface ProdutoService {

    Produto save(Produto produto);

    List<Produto> findAll();

    Optional<Produto> findById(Long id);

    Produto update(Produto product);

    void deleteById(Long id);

}

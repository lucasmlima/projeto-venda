package com.unifan.projetovenda.service;

import com.unifan.projetovenda.entity.Produto;
import com.unifan.projetovenda.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoServiceImpl implements ProdutoService{

    @Autowired
    ProdutoRepository produtoRepository;

    @Override
    public Produto save(Produto produto) {
        return produtoRepository.save(produto);
    }

    @Override
    public List<Produto> findAll() {
        return produtoRepository.findAll();
    }

    @Override
    public Optional<Produto> findById(Long id) {
        return produtoRepository.findById(id);
    }

    @Override
    public Produto update(Produto produto) {
        return produtoRepository.save(produto);
    }

    @Override
    public void deleteById(Long id) {
        produtoRepository.deleteById(id);
    }

    public boolean existsById(Long produtoId) {
        return produtoRepository.existsById(produtoId);
    }

}

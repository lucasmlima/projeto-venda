package com.unifan.projetovenda.controller;

import com.unifan.projetovenda.entity.Produto;
import com.unifan.projetovenda.service.ProdutoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    @Autowired
    ProdutoServiceImpl service;

    @GetMapping(path = "/all", produces = "application/json")
    public ResponseEntity<List<Produto>> findAll(){

        List<Produto> response = service.findAll();
        return ResponseEntity.ok(response);
    }

    @GetMapping("/{produtoId}")
    public ResponseEntity<Produto> findById(@PathVariable Long produtoId) {

        Optional<Produto> produtoOptional = service.findById(produtoId);
        if (produtoOptional.isPresent()) {
            return ResponseEntity.ok(produtoOptional.get());
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping()
    public ResponseEntity<Produto> create(@RequestBody Produto produto){

        Produto response = service.save(produto);
        return ResponseEntity.ok(response);
    }

    @PutMapping("/{produtoId}")
    public ResponseEntity<Produto> update(@PathVariable Long produtoId, @RequestBody Produto produto){

        if (!service.existsById(produtoId)) {
            return ResponseEntity.notFound().build();
        }
        service.update(produto);
        return ResponseEntity.ok(produto);
    }

    @DeleteMapping("/{produtoId}")
    public ResponseEntity<Void> delete(@PathVariable Long produtoId) {

        if (!service.existsById(produtoId)) {
            return ResponseEntity.notFound().build();
        }
        service.deleteById(produtoId);
        return ResponseEntity.noContent().build();
    }


}

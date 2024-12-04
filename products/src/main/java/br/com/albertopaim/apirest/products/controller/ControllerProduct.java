package br.com.albertopaim.apirest.products.controller;

import br.com.albertopaim.apirest.products.model.Produto;
import br.com.albertopaim.apirest.products.repository.ProductRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/products")
public class ControllerProduct {
    private ProductRepository productRepository;

    public ControllerProduct(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @PostMapping
    public void create(@RequestBody Produto produto) {
        var id = UUID.randomUUID();
        produto.setId(String.valueOf(id));

        productRepository.save(produto);

        System.out.println("Produto recebido" + produto);
    }
}

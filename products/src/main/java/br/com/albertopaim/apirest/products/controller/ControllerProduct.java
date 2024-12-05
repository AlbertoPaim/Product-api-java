package br.com.albertopaim.apirest.products.controller;

import br.com.albertopaim.apirest.products.model.Produto;
import br.com.albertopaim.apirest.products.repository.ProductRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/products")
public class ControllerProduct {
    private ProductRepository productRepository;

    public ControllerProduct(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @PostMapping
    public Produto create(@RequestBody Produto produto) {
        var id = UUID.randomUUID();
        produto.setId(String.valueOf(id));
        productRepository.save(produto);
        return produto;

    }

    @GetMapping("/{id}")
    public Produto getProduct(@PathVariable String id) {
        return productRepository.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable String id) {
        productRepository.deleteById(id);
    }

    @PutMapping("/{id}")
    public void updateProduct(@PathVariable String id, @RequestBody Produto produto) {
        produto.setId(id);
        productRepository.save(produto);
    }

    @GetMapping
    public List<Produto> getProducts(@RequestParam("name") String name) {
        return productRepository.findByName(name);
    }
}

package br.com.albertopaim.apirest.products.controller;

import br.com.albertopaim.apirest.products.model.Produto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ControllerProduct {

    @PostMapping
    public void create(@RequestBody Produto produto) {
        System.out.println("Produto recebido" + produto);
    }
}

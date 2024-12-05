package br.com.albertopaim.apirest.products.repository;

import br.com.albertopaim.apirest.products.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Produto, String> {
    List<Produto> findByName(String name);
}

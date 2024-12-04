package br.com.albertopaim.apirest.products.repository;

import br.com.albertopaim.apirest.products.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Produto, String> {
}

package io.github.cursodsousa.produtosapi.repository;

import io.github.cursodsousa.produtosapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

// Tem que passar o tipo da entidade e o tipo do id.
public interface ProdutoRepository extends JpaRepository<Produto, String> {

    // Tem que seguir a nomenclatura do repository; ex: findBy
    // O nome da propriedade buscada tem que estar igual ao definido no model
    // O metodo não tem implementação (corpo)
    List<Produto> findByNome(String nome);
}

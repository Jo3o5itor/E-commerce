package com.senai.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.yaml.snakeyaml.events.Event.ID;

import com.senai.ecommerce.entities.Pagamento;

public interface PagamentoRepository extends JpaRepository<Pagamento, ID>{

}

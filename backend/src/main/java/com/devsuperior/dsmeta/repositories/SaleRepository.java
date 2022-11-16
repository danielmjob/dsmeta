package com.devsuperior.dsmeta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsmeta.entities.Sale;

/*
 * o Spring cria o componente que ja salva deleta e busca no banco de dados
 */

public interface SaleRepository extends JpaRepository<Sale, Long> {

}

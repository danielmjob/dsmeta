package com.devsuperior.dsmeta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dsmeta.entities.Sale;
import com.devsuperior.dsmeta.repositories.SaleRepository;

@Service // Registra a classe como um componente do sistema
public class SaleService {

	@Autowired // Gera a dependencia de um componente para outro
	private SaleRepository repository;
	
	public List<Sale>findSales() {
		return repository.findAll();
	}
}

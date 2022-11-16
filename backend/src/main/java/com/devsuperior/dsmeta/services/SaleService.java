package com.devsuperior.dsmeta.services;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.devsuperior.dsmeta.entities.Sale;
import com.devsuperior.dsmeta.repositories.SaleRepository;

@Service // Registra a classe como um componente do sistema
public class SaleService {

	@Autowired // Gera a dependencia de um componente para outro
	private SaleRepository repository;
	
	public Page<Sale>findSales(String minDate, String maxDate, Pageable pageable) {
		
		LocalDate today = LocalDate.ofInstant(Instant.now(), ZoneId.systemDefault()); // requisitar a data de hoje
		
		LocalDate min = minDate.equals("") ? today.minusDays(365) : LocalDate.parse(minDate); //se a data min estiver vazia pega a data de um ano atras caso contrario fazer a conversão
		LocalDate max = maxDate.equals("") ? today : LocalDate.parse(maxDate); //se a data max estiver vazia pega a data de hj caso contrario fazer a conversão
		
		return repository.findSales(min, max, pageable);
	}
}

package com.matheusmatos.dsmeta.services;

import java.util.List;

import com.matheusmatos.dsmeta.entities.Sale;
import com.matheusmatos.dsmeta.repositories.SaleRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaleService {
	
	/*Operação para buscar List no banco de Dados*/
	
	@Autowired
	private SaleRepository repository;
	
	public List<Sale> findSales() {
		return repository.findAll();
	}
}

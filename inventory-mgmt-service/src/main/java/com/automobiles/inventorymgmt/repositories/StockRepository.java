package com.automobiles.inventorymgmt.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.automobiles.inventorymgmt.entites.Stock;

public interface StockRepository extends JpaRepository<Stock, Integer> {
	
	
	List<Stock> findByStockNameLike(String stockName);
	
}

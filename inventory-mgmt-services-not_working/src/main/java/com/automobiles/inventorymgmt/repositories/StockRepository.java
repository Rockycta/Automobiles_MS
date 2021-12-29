package com.automobiles.inventorymgmt.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.automobiles.inventorymgmt.entities.Stock;
import com.automobiles.inventorymgmt.entities.dto.StockDto;

public interface StockRepository  extends JpaRepository<Stock, Integer>{
	
		public List<Stock> findByStockNameLike(String stockName);
		
}

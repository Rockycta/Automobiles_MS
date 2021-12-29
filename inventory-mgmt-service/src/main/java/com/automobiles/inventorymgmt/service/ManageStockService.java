package com.automobiles.inventorymgmt.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;

import com.automobiles.inventorymgmt.entites.dto.StockDto;
import com.automobiles.inventorymgmt.repositories.StockRepository;

@Service 
@ConfigurationProperties(prefix = "stock")
public class ManageStockService {

	private String transportType;
	private int slaDays;

	@Autowired
	public StockRepository stockRepository;

	public List<StockDto> getStocks(String stockName){
	 
	return stockRepository.findByStockNameLike("%"+ stockName +"%").stream().map(e -> {
		 
				 StockDto dto = new StockDto();
				 BeanUtils.copyProperties(e, dto);
				 return dto;
		 }).toList();		 	
	}

	public String getTransportType() {
		return transportType;
	}

	public void setTransportType(String transportType) {
		this.transportType = transportType;
	}

	public int getSlaDays() {
		return slaDays;
	}

	public void setSlaDays(int slaDays) {
		this.slaDays = slaDays;
	}


}

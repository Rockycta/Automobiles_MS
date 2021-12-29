package com.automobiles.inventorymgmt.entites.dto;

import lombok.Data;

@Data
public class StockDto {
	
	protected int stockNo;
	protected String stockName;
	protected String description;
	protected int quantity;
	protected double unitPrice;	

}

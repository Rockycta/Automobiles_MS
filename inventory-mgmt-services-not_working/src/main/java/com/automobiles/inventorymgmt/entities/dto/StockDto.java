package com.automobiles.inventorymgmt.entities.dto;


import lombok.Data;

@Data
public class StockDto {

	protected int stockNo;
	protected String stockName;
	protected String description;
	protected int quantity;
	protected double unitPrice;	
}

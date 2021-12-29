package com.automobiles.inventorymgmt.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.Data;

@Entity
@Table(name="stock")
@Data
public class Stock {
	
	@Id
	@Column(name="stock_no")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected int stockNo;
	
	@Column(name="stock_name")
	protected String stockName;
	
	@Column(name="description")
	protected String description;
	
	@Column(name="quantity")
	protected int quantity;
	
	@Column(name="unit_price")
	protected double unitPrice ;
	
}

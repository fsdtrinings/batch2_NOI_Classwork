package com.abc.app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) // AUTO , 
	private int productId;
	private String productName;
	private String category;
	private int price;
	
	public Product(String productName, String category, int price) {
		super();
		this.productName = productName;
		this.category = category;
		this.price = price;
	}
	
	
	
}

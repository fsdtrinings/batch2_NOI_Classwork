package com.abc.app.entity;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

	private int customerCode;
	private String customerName;
	private String address;
	private long phoneNumber;
	private boolean isPrimeCustomer;
	
	
}

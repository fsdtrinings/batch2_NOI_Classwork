package com.abc.app.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreditCard {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cardNumber;
	private String cardName;
	private int cvv;
	private LocalDate expiryDate;
	
	/* optional*/
	public CreditCard(String cardName, int cvv) {
		
		this.cardName = cardName;
		this.cvv = cvv;
		this.expiryDate = LocalDate.of(2030, 12, 31);
	}
	
	
	
	
}

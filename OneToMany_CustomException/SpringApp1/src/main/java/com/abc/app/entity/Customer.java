package com.abc.app.entity;

import java.util.List;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "abcKart")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int customerCode; // auto generated 
	
	@Column(nullable = false)
	private String customerName;
	private String bankName;
	private long phoneNumber;
	private boolean isPrimeCustomer;
	
	@Embedded
	private Address address;
	
	@OneToMany
	private List<DiscountCoupon> coupons;
	
	@OneToOne
	@JoinColumn(name = "PaymentCard")
	private CreditCard creditCard;
	
	

}











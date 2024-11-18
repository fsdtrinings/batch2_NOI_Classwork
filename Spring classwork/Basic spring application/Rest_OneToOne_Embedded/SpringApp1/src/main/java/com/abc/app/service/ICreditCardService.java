package com.abc.app.service;

import org.springframework.stereotype.Service;

import com.abc.app.entity.CreditCard;

@Service
public interface ICreditCardService {

	public CreditCard insertCreditCard(CreditCard card);
	
	public CreditCard getCreditCardByCardNumber(int cardNumber);
	
}

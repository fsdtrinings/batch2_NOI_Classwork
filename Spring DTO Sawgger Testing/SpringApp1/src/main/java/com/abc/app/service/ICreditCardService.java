package com.abc.app.service;

import org.springframework.stereotype.Service;

import com.abc.app.entity.CreditCard;
import com.abc.app.exception.InvalidCardException;

@Service
public interface ICreditCardService {

	public CreditCard insertCreditCard(CreditCard card)throws InvalidCardException;
	
	public CreditCard getCreditCardByCardNumber(int cardNumber);
	
}

package com.abc.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.app.entity.CreditCard;
import com.abc.app.repository.ICreditCardRepository;

@Service
public class CreditCardServiceImpl implements ICreditCardService {

	@Autowired
	ICreditCardRepository cardRepository;
	
	@Override
	public CreditCard insertCreditCard(CreditCard card) {
		CreditCard savedCard  = cardRepository.save(card);
		return savedCard;
	}

	@Override
	public CreditCard getCreditCardByCardNumber(int cardNumber) {
		
		CreditCard savedCard = cardRepository.findById(cardNumber).get();
		
		return savedCard;
	}

}

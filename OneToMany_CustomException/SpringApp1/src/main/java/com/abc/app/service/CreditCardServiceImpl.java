package com.abc.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.app.entity.CreditCard;
import com.abc.app.exception.InvalidCardException;
import com.abc.app.repository.ICreditCardRepository;

@Service
public class CreditCardServiceImpl implements ICreditCardService {

	@Autowired
	ICreditCardRepository cardRepository;
	
	@Override
	public CreditCard insertCreditCard(CreditCard card)throws InvalidCardException
	{
		if(card.getCvv()>99&&card.getCvv()<1000)
		{
			CreditCard savedCard  = cardRepository.save(card);
			return savedCard;
		}
		else
		{
			throw new InvalidCardException("Invalid CVV Number "+card.getCvv()," Customer Service Imp Card Add");
		}
	}

	@Override
	public CreditCard getCreditCardByCardNumber(int cardNumber) {
		
		CreditCard savedCard = cardRepository.findById(cardNumber).get();
		
		return savedCard;
	}

}

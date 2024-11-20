package com.abc.app.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.abc.app.entity.CreditCard;
import com.abc.app.repository.ICreditCardRepository;

@SpringBootTest
class CreditCardServiceImplTest {
	
	@Autowired
	ICreditCardService cardService; // class under test

	@MockBean
	ICreditCardRepository cardRepo; // Dependency
	
	@Test
	@Disabled
	void testInsertCreditCard() {
		fail("Not yet implemented");
	}

	@Test
	void testGetCreditCardByCardNumber() {
		
		CreditCard mockExpectation = new CreditCard("Mastercard", 123);
		Mockito.when(cardRepo.findById(1)).thenReturn(Optional.of(mockExpectation));
		
		//CreditCard expected = new CreditCard("Mastercard", 123);
		
		CreditCard actual = cardService.getCreditCardByCardNumber(1);
		Assertions.assertEquals(mockExpectation, actual);
	}

}











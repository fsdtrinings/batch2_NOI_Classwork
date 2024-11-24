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

import com.abc.app.entity.Address;
import com.abc.app.entity.CreditCard;
import com.abc.app.repository.ICreditCardRepository;

@SpringBootTest
class CreditCardServiceImplTest {
	
	@Autowired
	ICreditCardService cardService; // class under test

	@MockBean
	ICreditCardRepository cardRepo; // Dependency
	
	@Test
	//@Disabled
	void testabc() {
		
		Address a1 = new Address("A-123","India");
		Address a2 = new Address("A-123","India");
		Address a3 = new Address("B-123","Singapore");
		
		assertEquals(a1,a3);
	}

	@Test
	void testGetCreditCardByCardNumber_postivedata() {
		
		/** Creation of Sample Data, which will be provided by Mockito during actual test*/
		CreditCard mockExpectation = new CreditCard("Mastercard", 123);
		Mockito.when(cardRepo.findById(1)).thenReturn(Optional.of(mockExpectation));
		
		//CreditCard expected = new CreditCard("Mastercard", 123);
		
		/**  Actual execution of code */
		CreditCard actual = cardService.getCreditCardByCardNumber(1);
		
		/** Comparing test results*/
		Assertions.assertEquals(mockExpectation, actual);
	}

}











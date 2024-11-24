package com.abc.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.abc.app.entity.CreditCard;
import com.abc.app.entity.Customer;
import com.abc.app.service.ICreditCardService;
import com.abc.app.service.ICustomerService;

@RestController
@RequestMapping("/app/card")
public class CreditCardRestController {
	
	@Autowired
	ICreditCardService cardService;
	
	@Autowired
	ICustomerService customerService;

	public CreditCardRestController() {
		System.out.println("Inside Credit card rest controller");
	}
	
	
	@PostMapping("/register")  // localhost:8081/app/card/register?c_id=101
	public ResponseEntity<Customer> saveCreditCard(@RequestBody CreditCard creditCard,@RequestParam int c_id)throws Exception
	{
		Customer fromDB = null;
		if(creditCard != null)
		{
			CreditCard savedCard = cardService.insertCreditCard(creditCard);
			String msg =  "Card Added "+savedCard.getCardNumber()+" "+savedCard.getCardName();
			
			fromDB = customerService.getCustomerByCode(c_id);
			
				if(fromDB!=null)
				{
					Customer customer = customerService.updateCreditCard(fromDB, savedCard);
				}
				else throw new Exception("Customer not available");
			
		}
		
		return new ResponseEntity<Customer>(fromDB, HttpStatus.OK);
		
	}
	

}

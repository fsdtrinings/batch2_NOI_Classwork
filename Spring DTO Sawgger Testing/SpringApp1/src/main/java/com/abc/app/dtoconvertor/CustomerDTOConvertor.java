package com.abc.app.dtoconvertor;

import org.springframework.stereotype.Component;

import com.abc.app.dto.CustomerDeliveryDTO;
import com.abc.app.dto.CustomerprofileDTO;
import com.abc.app.entity.Customer;

@Component
public class CustomerDTOConvertor {

	public CustomerDeliveryDTO getDTO(Customer c)
	{
		return new CustomerDeliveryDTO(c.getCustomerName(), c.getPhoneNumber(), c.getAddress().toString());
	}
	
	// we can create multiple converters
	
	public CustomerprofileDTO getProfileDTO(Customer c)
	{
		return new CustomerprofileDTO(c.getCustomerName(), c.getPhoneNumber(),
				c.getAddress().toString(),c.getBankName());
	}
}

package com.abc.app.service;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.abc.app.entity.Address;
import com.abc.app.entity.CreditCard;
import com.abc.app.entity.Customer;

@Service
public interface ICustomerService {

	public String registerCustomer(Customer customer);
	public Customer getCustomerByCode(int code);
	public List<Customer> getCustomerByActivePrimeStatus();
	public List<Customer> getCustomerByCityName(String cityName);
	public Customer getCustomerByPhone(long phone);
	
	
	public Customer updateAddress(Customer customer,Address newAddress);
	
	
	public Customer updateCreditCard(Customer customer,CreditCard card)throws Exception;
	
}

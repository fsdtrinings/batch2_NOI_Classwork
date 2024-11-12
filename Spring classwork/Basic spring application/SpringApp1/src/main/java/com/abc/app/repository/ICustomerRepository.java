package com.abc.app.repository;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.abc.app.entity.Customer;

//@Repository
@Component
public interface ICustomerRepository {

	public int registerCustomer(Customer customer);
	public Customer getCustomerByCode(int code);
	public List<Customer> getCustomerByActivePrimeStatus();
	public List<Customer> getCustomerByCityName(String cityName);
	public Customer getCustomerByPhone(long phone);
	
	
}

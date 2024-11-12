package com.abc.app.repository;

import java.lang.annotation.Retention;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.abc.app.entity.Customer;

@Component
public class CustomerRepositoryImpl implements ICustomerRepository {

	
	List<Customer> allCustomerDB = new ArrayList<>(); // replace by Database in next version
	
	
	
	
	public CustomerRepositoryImpl() {
		// dummy data
		Customer c = new Customer(101, "Ramesh", "A-123", 9654144814L, false);
		Customer c2 = new Customer(102, "Suresh", "B-123", 9754144814L, true);
		
		allCustomerDB.add(c);
		allCustomerDB.add(c2);
		
		
		System.err.println(" Customer Repository "+allCustomerDB.size());
	}

	@Override
	public int registerCustomer(Customer customer) {
		if(customer != null)
		{
			allCustomerDB.add(customer);
			return customer.getCustomerCode();
		}
		else return 0;
	}

	@Override
	public Customer getCustomerByCode(int code) {
	
		Customer output = allCustomerDB.stream().
				filter((c)->{
			if(c.getCustomerCode() == code)
			{
				return true;
			}
			else return false;
		}).findFirst().get();
		
		
		return output;
		
	}

	@Override
	public List<Customer> getCustomerByActivePrimeStatus() {
		List<Customer> outputList = allCustomerDB.stream().
				filter((c)->{
			if(c.isPrimeCustomer() == true)
			{
				return true;
			}
			else return false;
		}).collect(Collectors.toList());
		
		
		return outputList;
	}

	@Override
	public List<Customer> getCustomerByCityName(String cityName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer getCustomerByPhone(long phone) {
		// TODO Auto-generated method stub
		return null;
	}

}

package com.abc.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.app.entity.Customer;
import com.abc.app.repository.ICustomerRepository;

@Service
public class CustomerServiceImpl implements ICustomerService 
{

	@Autowired
	ICustomerRepository customerRepository;
	
	
	@Override
	public String registerCustomer(Customer customer) {
		
		if(customer != null)
		{
			// business logic , would be based on business requirement
			if(customer.getCustomerCode()>0 && customer.getCustomerName().length()>0)
			{
				customerRepository.registerCustomer(customer);
				return "Customer "+customer+" Registered";
			}
			else return "Error !!! during registration , Contact to Admin";
		}
		
		return "Error !!! during registration , Contact to Admin";
	}

	@Override
	public Customer getCustomerByCode(int code) {
		Customer c = customerRepository.getCustomerByCode(code);
		return c;
	}

	@Override
	public List<Customer> getCustomerByActivePrimeStatus() {
		// TODO Auto-generated method stub
		return null;
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

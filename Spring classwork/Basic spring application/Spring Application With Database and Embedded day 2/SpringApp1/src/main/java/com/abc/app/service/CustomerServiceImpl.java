package com.abc.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.app.entity.Address;
import com.abc.app.entity.Customer;
import com.abc.app.repository.ICustomerRepository;

import jakarta.transaction.Transactional;

@Service
public class CustomerServiceImpl implements ICustomerService {

	
	@Autowired
	ICustomerRepository customerRepository;
	
	@Override
	@Transactional
	public String registerCustomer(Customer customer) {
		
		Customer savedCustomer = customerRepository.save(customer);
		return savedCustomer.toString();
	}

	@Override
	public Customer getCustomerByCode(int code) {
		
		 Optional<Customer> opCustomer  = customerRepository.findById(code);
		 return opCustomer.get();
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

	@Override
	@Transactional
	public Customer updateAddress(Customer customer, Address newAddress) {
		
		System.out.println("Inside Service Impl 3 Update Address Inputs : "+customer +" "+newAddress);
		customer.setAddress(newAddress);
		System.out.println("Inside service impl 4 address updated ");
		return customer;
		
		
	}

	
	
	
	
}

























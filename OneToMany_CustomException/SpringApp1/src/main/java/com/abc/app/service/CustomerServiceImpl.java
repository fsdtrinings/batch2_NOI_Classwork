package com.abc.app.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.app.entity.Address;
import com.abc.app.entity.CreditCard;
import com.abc.app.entity.Customer;
import com.abc.app.entity.DiscountCoupon;
import com.abc.app.exception.InvalidCardException;
import com.abc.app.repository.ICustomerRepository;
import com.abc.app.repository.IDiscountCouponRepository;

import jakarta.transaction.Transactional;

@Service
public class CustomerServiceImpl implements ICustomerService {

	
	@Autowired
	ICustomerRepository customerRepository;
	
	@Autowired
	IDiscountCouponRepository couponRepository;
	
	@Override
	@Transactional
	public String registerCustomer(Customer customer) {
		
		Customer savedCustomer = customerRepository.save(customer);
		return savedCustomer.toString();
	}
	
	@Override
	@Transactional
	public Customer addWelcomeCoupon(Customer customer,DiscountCoupon coupon) {
		
		Customer savedCustomer = customerRepository.save(customer);
		
		List<DiscountCoupon> userCoupon = new ArrayList<>();
		userCoupon.add(coupon);
		
		savedCustomer.setCoupons(userCoupon);
		
		return savedCustomer;
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

	@Override
	@Transactional
	public Customer updateCreditCard(Customer customer, CreditCard card)
				throws Exception {
		
		
		if(customer != null && card != null)
		{
			
			if(card.getCvv()>99&&card.getCvv()<1000)
			{
				System.out.println("Inside updateCreditCard if no null value ");
				customer.setCreditCard(card);
			}
			else
			{
				throw new InvalidCardException("Invalid CVV Number "+card.getCvv()," Customer Service Imp Card Add");
			}
			
			
		}
		else throw new Exception("Problem during linking card "+customer+" & "+card);
		
		
		return customer;
	}

	@Override
	@Transactional
	public List<DiscountCoupon> updateCouponList(DiscountCoupon newCoupon,Customer customer) {
		
		// get all coupons of customer 
		
		if(customer != null)
		{
			List<DiscountCoupon> allCouponsOfCustomer = customer.getCoupons();
			allCouponsOfCustomer.add(newCoupon); 
			customer.setCoupons(allCouponsOfCustomer);// it will hit update statement
			return allCouponsOfCustomer;
		}
		
		
		return null;
		
	}

	

	
	
	
	
}

























package com.abc.app.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abc.app.entity.Address;
import com.abc.app.entity.Customer;
import com.abc.app.entity.DiscountCoupon;
import com.abc.app.service.ICustomerService;
import com.abc.app.service.IDiscountCouponService;

@RestController
@RequestMapping("/app")
public class MyAppRestController {

	@Autowired
	ICustomerService customerService;
	
	@Autowired
	IDiscountCouponService couponService;
	
	public MyAppRestController() {
	
		System.err.println("Rest Controller called ");
	}
	
	
	@PostMapping("/customer/register") // localhost:8081/app/customer/register
	public Customer doRegisterCustomer(@RequestBody Customer customer)
	{
		String status = "";
		
		status = customerService.registerCustomer(customer);
		
		DiscountCoupon welcomeCoupon = couponService.getDiscountCouponByCouponName("welcomCoupon");
		
		Customer savedCustomer = customerService.addWelcomeCoupon(customer, welcomeCoupon);
		
		
		return savedCustomer;
	}
	
	@PutMapping("/customer/{code}/address")
	public ResponseEntity<Customer> updateAddress(@RequestBody Address address,@PathVariable int code)
	{
		Customer customer = null;
		
		Customer savedCustomer = customerService.getCustomerByCode(code);
		System.out.println(" Inside update Customer Address 1 "+savedCustomer);
		if(savedCustomer != null)
		{
			if(address != null)
			{
				System.out.println(" Inside if customer update Address 2 ");
				Customer withUpdatedAddress = customerService.updateAddress(savedCustomer, address);
				System.out.println("5 after updation inside rest controller "+withUpdatedAddress);
				return new ResponseEntity<Customer>(withUpdatedAddress, HttpStatus.OK);
			}
			
		}
		
		return new ResponseEntity<Customer>(savedCustomer, HttpStatus.CONFLICT);
	}
	
	@GetMapping("/customer/coupons")
	public List<DiscountCoupon> getAllCoupons()
	{
		return couponService.getAllDiscountCoupon();
	}
	
	@PutMapping("/customer/{customerId}/coupon/{id}")
	public String addNewCouponCustomerEnd(@PathVariable int customerId ,@PathVariable int id)
	{
		Customer customerfromDB = customerService.getCustomerByCode(customerId);
		DiscountCoupon couponFromDb = couponService.getDiscountCouponBycouponId(id);
		
		if(customerfromDB!= null && couponFromDb!=null)
		{

			List<DiscountCoupon> allCouponsOfCustomer = customerService.updateCouponList(couponFromDb, customerfromDB);
			return "Coupon Added Count "+allCouponsOfCustomer.size();
			// write code to generate an exception
		}
		
		return "Error during adding coupons "+customerfromDB.getCoupons().size();
				
	}
	

	@GetMapping("/hello")
	public String hello()
	{
		return "Welcome User ";
	}
	
	@GetMapping("/customer/{code}")
	public Customer getabc(@PathVariable int code)
	{
		Customer fromDB = customerService.getCustomerByCode(code);
		return fromDB;
	}
	
}

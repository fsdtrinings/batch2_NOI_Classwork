package com.abc.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abc.app.entity.DiscountCoupon;
import com.abc.app.service.IDiscountCouponService;

@RestController
@RequestMapping("/app/admin")
public class AdminRestController {

	@Autowired
	IDiscountCouponService couponService;
	
	
	public AdminRestController() {
		System.err.println("Admin Rest Controller");
	}
	
	@PostMapping("/coupon/new") //"app/admin/coupon/new"
	public ResponseEntity<DiscountCoupon> createCoupon(@RequestBody DiscountCoupon coupon)
	{
		if(coupon != null)
		{
			DiscountCoupon ifSaved = couponService.createCoupon(coupon);
			if(ifSaved != null && ifSaved.getCouponId()!=0)
			{
				return new ResponseEntity<DiscountCoupon>(ifSaved, HttpStatus.OK);
			}
			else return new ResponseEntity<DiscountCoupon>(coupon, HttpStatus.FORBIDDEN);
				
		}
		else return new ResponseEntity<DiscountCoupon>(coupon, HttpStatus.FORBIDDEN);
	}
	
	@GetMapping("/coupons")
	public ResponseEntity<List<DiscountCoupon>> getAllCoupons()
	{
		List<DiscountCoupon> allCoupons = couponService.getAllDiscountCoupon();
		
		return new ResponseEntity<List<DiscountCoupon>>(allCoupons, HttpStatus.OK);
	}

	
	
}//end class

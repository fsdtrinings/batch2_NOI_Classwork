package com.abc.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.abc.app.entity.DiscountCoupon;

@Service
public interface IDiscountCouponService {

	public DiscountCoupon createCoupon(DiscountCoupon coupon);
	
	public DiscountCoupon getDiscountCouponBycouponId(int couponId);
	
	public DiscountCoupon getDiscountCouponByCouponName(String couponName);
	
	public List<DiscountCoupon> getAllDiscountCoupon();
	
	
}

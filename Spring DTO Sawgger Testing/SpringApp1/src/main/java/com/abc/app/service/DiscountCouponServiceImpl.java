package com.abc.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.app.entity.DiscountCoupon;
import com.abc.app.repository.IDiscountCouponRepository;

import jakarta.transaction.Transactional;

@Service
public class DiscountCouponServiceImpl implements IDiscountCouponService{

	// Autowire repository : bcoz we have to connect with database
	@Autowired
	IDiscountCouponRepository couponRepository;
	
	@Override
	@Transactional
	public DiscountCoupon createCoupon(DiscountCoupon coupon) {
		             // savedCoupon :-> ID
		DiscountCoupon savedCoupon = couponRepository.save(coupon);
		return savedCoupon;
	}

	@Override
	public DiscountCoupon getDiscountCouponBycouponId(int couponId) {
		
		return couponRepository.findById(couponId).get();
	}

	@Override
	public DiscountCoupon getDiscountCouponByCouponName(String couponName) {
		
		return couponRepository.getDiscountCouponByCouponName(couponName);
	}

	@Override
	public List<DiscountCoupon> getAllDiscountCoupon() {
		
		return couponRepository.findAll();
	}

	
	
}








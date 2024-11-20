package com.abc.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abc.app.entity.DiscountCoupon;

@Repository
public interface IDiscountCouponRepository extends JpaRepository<DiscountCoupon, Integer> 
{
	public DiscountCoupon getDiscountCouponByCouponName(String couponName);

}

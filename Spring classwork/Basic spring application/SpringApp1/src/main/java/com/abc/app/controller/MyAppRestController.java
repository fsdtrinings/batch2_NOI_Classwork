package com.abc.app.controller;

import java.awt.geom.CubicCurve2D;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abc.app.entity.Customer;
import com.abc.app.service.ICustomerService;

@RestController
@RequestMapping("/app")
public class MyAppRestController {

	@Autowired
	ICustomerService customerService;
	
	public MyAppRestController() {
	
		System.err.println("Rest Controller called ");
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

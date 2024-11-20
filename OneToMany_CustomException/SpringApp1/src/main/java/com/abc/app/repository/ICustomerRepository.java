package com.abc.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.abc.app.entity.Customer;

@Repository
public interface ICustomerRepository extends 
          JpaRepository<Customer, Integer> {


	
}

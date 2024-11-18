package com.abc.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abc.app.entity.CreditCard;

@Repository
public interface ICreditCardRepository extends JpaRepository<CreditCard, Integer> {

}

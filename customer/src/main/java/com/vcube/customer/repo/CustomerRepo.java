package com.vcube.customer.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vcube.customer.model.Customer;

public interface CustomerRepo extends JpaRepository<Customer,Integer> {

}

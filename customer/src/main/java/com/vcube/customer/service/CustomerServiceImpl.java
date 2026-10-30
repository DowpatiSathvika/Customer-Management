package com.vcube.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vcube.customer.model.Customer;
import com.vcube.customer.repo.CustomerRepo;

@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	CustomerRepo customerRepo;
	
	@Override
	public Customer addCustomer(Customer c) {
		return customerRepo.save(c);
	}
	
	@Override
	public List<Customer> getAllCustomerInfo(){
		return customerRepo.findAll(); //select * from customer)
	}
	
	public Customer getCustomer(Integer id) {
		return customerRepo.findById(id).get(); //select * from customer where id = 1
	}

	@Override
	public List<Customer> getAllCustomerinfo() {
		// TODO Auto-generated method stub
		return null;
	}
	
}

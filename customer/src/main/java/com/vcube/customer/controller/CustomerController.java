package com.vcube.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vcube.customer.model.Customer;
import com.vcube.customer.service.CustomerService;


@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/customer")



public class CustomerController {
	
	@Autowired
	CustomerService customerservice;
	
	@GetMapping("/get")
	String welcome(){
		return "Welcome to Springboot";
	}
	
	@GetMapping("/getCustomers")
	List<Customer> getAllCustomerInfo(){
		return customerservice.getAllCustomerinfo();
	}
	
	@GetMapping("/getCus/{cid}")
	Customer getCustomer(@PathVariable Integer cid){
		return customerservice.getCustomer(cid);
	}
	
	
	
	@PostMapping("/create")
	public Customer addCustomer(@RequestBody Customer customer) {

		    System.out.println("Name: " + customer.getName());
		    System.out.println("Age: " + customer.getAge());
		    System.out.println("Email: " + customer.getEmail());
		    System.out.println("State: " + customer.getState());
		    System.out.println("Phone: " + customer.getPhone());

		
		return customerservice.addCustomer(customer);
	}
}

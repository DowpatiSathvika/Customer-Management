package com.vcube.customer.service;

import java.util.List;

import com.vcube.customer.model.Customer;

public interface CustomerService {
	public abstract Customer addCustomer(Customer customer);

	public abstract List<Customer> getAllCustomerinfo();

	public abstract Customer getCustomer(Integer cid);

	List<Customer> getAllCustomerInfo();
}

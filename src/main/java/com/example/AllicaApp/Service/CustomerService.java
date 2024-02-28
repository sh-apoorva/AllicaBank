package com.example.AllicaApp.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.AllicaApp.Repository.CustomerRepository;
import com.example.AllicaApp.entity.Customer;

@Service
public class CustomerService {

	@Autowired
    private  CustomerRepository customerRepository;

    public Optional<Customer> findById(Long id) {
        return customerRepository.findById(id);
    }

	public Customer saveCustomer(Customer customer) {
		
		return customerRepository.save(customer);
	}
}
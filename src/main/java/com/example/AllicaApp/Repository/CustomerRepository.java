package com.example.AllicaApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.AllicaApp.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    

}
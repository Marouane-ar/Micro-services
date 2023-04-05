package com.example.customerservice.Service;

import com.example.customerservice.Entity.customer;

import java.util.List;

public interface customerService {

    customer save(customer customer);
    customer findById(Long id);
    List<customer> findAll();
}

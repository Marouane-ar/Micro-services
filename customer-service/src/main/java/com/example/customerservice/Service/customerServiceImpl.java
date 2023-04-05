package com.example.customerservice.Service;

import com.example.customerservice.Entity.customer;
import com.example.customerservice.Repository.customerRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class customerServiceImpl implements customerService {

    private customerRepository customerRepository;

    public customerServiceImpl(customerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public customer save(customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public customer findById(Long id) {
        return customerRepository.findById(id).get();
    }

    @Override
    public List<customer> findAll() {
        return customerRepository.findAll();
    }
}

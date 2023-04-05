package com.example.customerservice.Repository;

import com.example.customerservice.Entity.customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface customerRepository extends JpaRepository<customer,Long> {
}

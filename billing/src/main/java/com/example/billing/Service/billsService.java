package com.example.billing.Service;

import com.example.billing.Entity.bills;

import java.util.List;

public interface billsService {

    bills save(bills bills);
    bills findById(Long id);
    List<bills> findAll();
}

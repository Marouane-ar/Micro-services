package com.example.billing.Service;

import com.example.billing.Entity.bills;
import com.example.billing.Repository.billsRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class billsServiceImpl implements billsService {
    private billsRepository billsRepository;

    public billsServiceImpl(billsRepository billsRepository) {
        this.billsRepository = billsRepository;
    }

    @Override
    public bills save(bills bills) {
        return billsRepository.save(bills);
    }

    @Override
    public bills findById(Long id) {
        return billsRepository.findById(id).orElse(null);
    }

    @Override
    public List<bills> findAll() {
        return billsRepository.findAll();
    }
}

package com.example.billing.Service;

import com.example.billing.Entity.productItem;
import com.example.billing.Repository.productItemsRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class productItemServiceImpl implements productItemService {
    private productItemsRepository productItemsRepository;

    public productItemServiceImpl(productItemsRepository productItemsRepository) {
        this.productItemsRepository = productItemsRepository;
    }

    @Override
    public productItem save(productItem productItem) {
        return productItemsRepository.save(productItem);
    }

    @Override
    public productItem findById(Long id) {
        return productItemsRepository.findById(id).get();
    }

    @Override
    public List<productItem> findAll() {
        return productItemsRepository.findAll();
    }
}

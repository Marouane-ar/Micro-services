package com.example.inventoryservice.Service;

import com.example.inventoryservice.Entity.inventory;
import com.example.inventoryservice.Repository.inventoryRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class inventoryServiceImpl implements inventoryService {
    private inventoryRepository inventoryRepository;

    public inventoryServiceImpl(inventoryRepository inventoryRepository) {
        this.inventoryRepository = inventoryRepository;
    }

    @Override
    public inventory save(inventory inventory) {
        return inventoryRepository.save(inventory);
    }

    @Override
    public inventory findById(Long id) {
        return inventoryRepository.findById(id).get();
    }

    @Override
    public List<inventory> findAll() {
        return inventoryRepository.findAll();
    }
}

package com.example.inventoryservice.Service;

import com.example.inventoryservice.Entity.inventory;

import java.util.List;

public interface inventoryService {

    inventory save(inventory inventory);
    inventory findById(Long id);
    List<inventory> findAll();
}

package com.example.inventoryservice.Repository;

import com.example.inventoryservice.Entity.inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface inventoryRepository extends JpaRepository<inventory,Long> {
}

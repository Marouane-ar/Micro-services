package com.example.billing.Repository;

import com.example.billing.Entity.productItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface productItemsRepository extends JpaRepository<productItem,Long> {
}

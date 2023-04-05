package com.example.billing.Repository;

import com.example.billing.Entity.bills;
import org.springframework.data.jpa.repository.JpaRepository;

public interface billsRepository extends JpaRepository<bills,Long> {
}

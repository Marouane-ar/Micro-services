package com.example.billing.Service;

import com.example.billing.Entity.bills;
import com.example.billing.Entity.productItem;

import java.util.List;

public interface productItemService {

    productItem save(productItem productItem);
    productItem findById(Long id);
    List<productItem> findAll();
}

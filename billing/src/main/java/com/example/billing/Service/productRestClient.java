package com.example.billing.Service;

import com.example.billing.Model.product;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Collection;

@FeignClient(name = "inventory")
public interface productRestClient {

    @GetMapping("/find/{id}")
    product findproductById(@PathVariable Long id);

    @GetMapping("/findAll")
    Collection<product> allproduct();
}

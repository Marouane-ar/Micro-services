package com.example.billing.Service;

import com.example.billing.Model.customer;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "customer")
public interface customerRestClient {

    @GetMapping(path = "/find/{id}")
    customer findcustomerById(@PathVariable Long id);
}

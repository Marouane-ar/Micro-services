package com.example.customerservice.Web;

import com.example.customerservice.Entity.customer;
import com.example.customerservice.Service.customerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class customerController {

    private customerService customerService;

    public customerController(customerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping("/save")
    @ResponseBody
    public customer save(@RequestBody customer customer){
        return customerService.save(customer);
    }

    @GetMapping("/find/{id}")
    @ResponseBody
    public customer findById(@PathVariable Long id){
        return customerService.findById(id);
    }

    @GetMapping("/findAll")
    @ResponseBody
    public List<customer> findAll(){
        return customerService.findAll();
    }
}

package com.example.inventoryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
public class inventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(inventoryServiceApplication.class, args);
    }

}

package com.example.customerservice.Entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor @AllArgsConstructor
public class customer {

    @Id
    @GeneratedValue
    private Long id_customer;

    private String name_customer;

    private  String email_customer;
}

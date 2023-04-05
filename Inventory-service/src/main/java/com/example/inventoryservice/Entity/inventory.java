package com.example.inventoryservice.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor @AllArgsConstructor
public class inventory {

    @Id
    @GeneratedValue
    private Long id_inventory;

    private String libelle_inventory;

    private int quantity_inventory;

    private int price_inventory;

}

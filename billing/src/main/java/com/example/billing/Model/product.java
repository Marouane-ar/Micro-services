package com.example.billing.Model;

import lombok.Data;

@Data
public class product {

    private Long id_inventory;

    private String libelle_inventory;

    private int quantity_inventory;

    private int price_inventory;
}

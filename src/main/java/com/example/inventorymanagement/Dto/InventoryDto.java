package com.example.inventorymanagement.Dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InventoryDto {

    private int id;
    private int productId;
    private int quantity;
    private String status;

}

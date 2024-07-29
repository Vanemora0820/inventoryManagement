package com.example.inventorymanagement.Dto;


import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class InventoryDto {

    private int id;
    private int productId;
    private String productName;
    private int quantity;
    private String status;
    private String serialNumber;
    private int userId;
    private LocalDate date;

}

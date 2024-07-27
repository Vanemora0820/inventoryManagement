package com.example.inventorymanagement.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "inventory")

public class Inventory {


    @Id

    private int id;
    private int productId;
    private int quantity;
    private String status;


    public Inventory() {
        this.status = "No Disponible";
    }

}

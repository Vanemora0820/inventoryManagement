package com.example.inventorymanagement.repository;

import com.example.inventorymanagement.entity.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository <Inventory, Long>{



}

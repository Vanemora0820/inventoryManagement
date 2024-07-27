package com.example.inventorymanagement.service;

import com.example.inventorymanagement.Dto.InventoryDto;

import java.util.List;

public interface InventoryService {
    List<InventoryDto> getAllInventory();
    InventoryDto addInventory(InventoryDto inventoryDTO);
    InventoryDto updateInventoryStatus(int id);
}

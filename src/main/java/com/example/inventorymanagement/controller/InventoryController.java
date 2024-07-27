package com.example.inventorymanagement.controller;


import com.example.inventorymanagement.Dto.InventoryDto;
import com.example.inventorymanagement.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/inventory")
public class InventoryController {

    @Autowired
    private InventoryService inventoryService;

    @GetMapping
    public List<InventoryDto> getAllInventory() {
        return inventoryService.getAllInventory();
    }

    @PostMapping
    public InventoryDto addInventory(@RequestBody InventoryDto inventoryDTO) {
        return inventoryService.addInventory(inventoryDTO);
    }

    @PutMapping("/{id}/deliver")
    public InventoryDto updateInventoryStatus(@PathVariable Long id) {
        return inventoryService.updateInventoryStatus(Math.toIntExact(id));
    }




}

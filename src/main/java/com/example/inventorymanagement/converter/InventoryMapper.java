package com.example.inventorymanagement.converter;


import com.example.inventorymanagement.Dto.InventoryDto;
import com.example.inventorymanagement.entity.Inventory;
import org.springframework.stereotype.Component;

@Component
public class InventoryMapper {

    public static InventoryDto inventoryDto(Inventory inventory) {
        InventoryDto inventoryDto = new InventoryDto();
        inventoryDto.setId(inventory.getId());
        inventoryDto.setProductId(inventoryDto.getProductId());
        inventoryDto.setQuantity(inventoryDto.getQuantity());
        inventoryDto.setStatus(inventoryDto.getStatus());
        return inventoryDto;
    }

    public static Inventory inventory (InventoryDto inventoryDto) {
        Inventory inventory = new Inventory();
        inventory.setId(inventoryDto.getId());
        inventory.setProductId(inventoryDto.getProductId());
        inventory.setQuantity(inventoryDto.getQuantity());
        inventory.setStatus(inventoryDto.getStatus());
        return inventory;
    }



}

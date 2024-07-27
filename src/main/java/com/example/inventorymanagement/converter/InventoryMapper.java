package com.example.inventorymanagement.converter;


import com.example.inventorymanagement.Dto.InventoryDto;
import com.example.inventorymanagement.entity.Inventory;
import com.example.inventorymanagement.entity.Product;
import com.example.inventorymanagement.entity.User;
import org.springframework.stereotype.Component;

@Component
public class InventoryMapper {

    public static InventoryDto inventoryDto(Inventory inventory) {
        InventoryDto inventoryDto = new InventoryDto();
        inventoryDto.setId(inventory.getId());
        inventoryDto.setProductId(inventory.getProduct() != null ? inventory.getProduct().getId() : null);
        inventoryDto.setQuantity(inventory.getQuantity());
        inventoryDto.setStatus(inventory.getStatus());
        inventoryDto.setSerialNumber(inventory.getSerialNumber());
        inventoryDto.setUserId(inventory.getUser() != null ? inventory.getUser().getId() : null);
        return inventoryDto;
    }

    public static Inventory inventory (InventoryDto inventoryDto, User user, Product product) {
        Inventory inventory = new Inventory();
        inventory.setId(inventoryDto.getId());
        inventory.setProduct(product);
        inventory.setQuantity(inventoryDto.getQuantity());
        inventory.setStatus(inventoryDto.getStatus());
        inventory.setSerialNumber(inventoryDto.getSerialNumber());
        inventory.setUser(user);
        return inventory;
    }

}

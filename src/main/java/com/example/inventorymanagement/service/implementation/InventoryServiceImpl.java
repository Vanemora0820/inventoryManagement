package com.example.inventorymanagement.service.implementation;


import com.example.inventorymanagement.Dto.InventoryDto;
import com.example.inventorymanagement.converter.InventoryMapper;
import com.example.inventorymanagement.entity.Inventory;
import com.example.inventorymanagement.entity.Product;
import com.example.inventorymanagement.entity.User;
import com.example.inventorymanagement.repository.InventoryRepository;
import com.example.inventorymanagement.repository.ProductRepository;
import com.example.inventorymanagement.repository.UserRepository;
import com.example.inventorymanagement.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class InventoryServiceImpl  implements InventoryService {

    @Autowired
    private InventoryRepository inventoryRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<InventoryDto> getAllInventory() {
        return inventoryRepository.findAll().stream()
                .map(InventoryMapper::inventoryDto)
                .collect(Collectors.toList());
    }

    @Override
    public InventoryDto addInventory(InventoryDto inventoryDto) {
        User user = userRepository.findById(inventoryDto.getUserId()).get();
        Product product = productRepository.findById((long) inventoryDto.getProductId()).orElseThrow();
        Inventory inventory = InventoryMapper.inventory(inventoryDto, user, product);
        Inventory savedInventory = inventoryRepository.save(inventory);
        return InventoryMapper.inventoryDto(savedInventory);
    }

    @Override
    public InventoryDto updateInventoryStatus(int id) {
        Inventory inventory = inventoryRepository.findById((long) id).orElseThrow();
        inventory.setStatus("Entregado");
        Inventory updatedInventory = inventoryRepository.save(inventory);
        return InventoryMapper.inventoryDto(updatedInventory);
    }


}

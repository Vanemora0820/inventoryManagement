package com.example.inventorymanagement.service.implementation;

import com.example.inventorymanagement.Dto.ProductDto;
import com.example.inventorymanagement.converter.ProductMapper;
import com.example.inventorymanagement.entity.Product;
import com.example.inventorymanagement.repository.ProductRepository;
import com.example.inventorymanagement.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service

public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<ProductDto> getAllProducts() {
        return productRepository.findAll().stream()
                .map(ProductMapper::productDto)
                .collect(Collectors.toList());
    }

    @Override
    public ProductDto createProduct(ProductDto productDto) {
        Product product = ProductMapper.product(productDto);
        Product savedProduct = productRepository.save(product);
        return ProductMapper.productDto(savedProduct);
    }

}


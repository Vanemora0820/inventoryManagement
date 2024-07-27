package com.example.inventorymanagement.service;

import com.example.inventorymanagement.Dto.ProductDto;

import java.util.List;

public interface ProductService {


    List<ProductDto> getAllProducts();
    ProductDto createProduct(ProductDto productDTO);
}

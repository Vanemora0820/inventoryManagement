package com.example.inventorymanagement.converter;


import com.example.inventorymanagement.Dto.ProductDto;
import com.example.inventorymanagement.entity.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper {

    public static ProductDto productDto (Product product) {
        ProductDto productDto = new ProductDto();
        productDto.setId(product.getId());
        productDto.setName(product.getName());
        productDto.setDescription(product.getDescription());
        return productDto;
    }

    public static Product product (ProductDto productDto) {
        Product product = new Product();
        product.setId(productDto.getId());
        product.setName(productDto.getName());
        product.setDescription(productDto.getDescription());
        return product;
    }

}

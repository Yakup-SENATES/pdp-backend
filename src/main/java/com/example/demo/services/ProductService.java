package com.example.demo.services;


import com.example.demo.dto.ProductDto;

import java.util.List;

public interface ProductService {
    List<ProductDto> getProductList();
    List<ProductDto> getProduct(int id);
}

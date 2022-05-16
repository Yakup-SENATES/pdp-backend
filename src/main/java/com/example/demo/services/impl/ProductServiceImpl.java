package com.example.demo.services.impl;

import com.example.demo.dto.ProductDto;
import com.example.demo.services.ProductService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {

    @Override
    public List<ProductDto> getProductList() {

        List<ProductDto> productList = new ArrayList<>();

        ProductDto productDto = new ProductDto();
        ProductDto productDto2 = new ProductDto();

        productDto.setId(productId);
        productDto.setPrice(productPrice);
        productDto.setDescription(productDescription);
        productDto.setTitle(productTitle);
        productDto.setProductHero(productHero);
        List<String> productImages = new ArrayList<>();
        productImages.add(productImage1);
        productImages.add(productImage2);
        productImages.add(productImage3);
        productImages.add(productImage4);
        productDto.setImages(productImages);




        productDto2.setId(productId2);
        productDto2.setPrice(productPrice2);
        productDto2.setDescription(productDescription);
        productDto2.setTitle(productTitle2);
        productDto2.setProductHero(productHero2);

        List<String> productImages2 = new ArrayList<>();
        productImages2.add(product2Image1);
        productImages2.add(product2Image2);
        productImages2.add(product2Image3);
        productImages2.add(product2Image4);
        productDto2.setImages(productImages2);


        productList.add(productDto);
        productList.add(productDto2);

        return productList;

    }

    @Override
    public List<ProductDto> getProduct(int id) {
        return getProductList().stream().filter(p -> p.getId()==id)
                .collect(Collectors.toList());
    }



    @Value("${product.id}")
    public Integer productId;

    @Value("${product.price}")
    public Integer productPrice;

    @Value("${product.title}")
    public String productTitle;

    @Value("${product.description}")
    public String productDescription;

    @Value("${product.product_hero}")
    public String productHero;

    @Value("${product.images1}")
    public String productImage1;
    @Value("${product.images2}")
    public String productImage2;
    @Value("${product.images3}")
    public String productImage3;
    @Value("${product.images4}")
    public String productImage4;




/*
* 2. Ürün için aynı işlemler
* */


    @Value("${product2.id}")
    public Integer productId2;

    @Value("${product2.price}")
    public Integer productPrice2;

    @Value("${product2.title}")
    public String productTitle2;

    @Value("${product2.description}")
    public String productDescription2;

    @Value("${product2.product_hero}")
    public String productHero2;

    @Value("${product2.images1}")
    public String product2Image1;
    @Value("${product2.images2}")
    public String product2Image2;
    @Value("${product2.images3}")
    public String product2Image3;
    @Value("${product2.images4}")
    public String product2Image4;


}

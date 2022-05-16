package com.example.demo.controllers;

import com.example.demo.dto.ProductDto;
import com.example.demo.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class ProductController {

        @Autowired
        ProductService productService;

        /*
        * Get ALl Product
        *
        */
        @GetMapping(value = "/products")
        public ResponseEntity<List<ProductDto>> getProductList(){
                System.out.println("/products calıstı");
            return ResponseEntity.ok(productService.getProductList());
        }


        /*
        * Get One Product By Id
        * */
        @GetMapping(value = "/products/{id}")
        public ResponseEntity<List<ProductDto>> getProduct(@PathVariable int id){
                System.out.println(productService.getProduct(id));
            return ResponseEntity.ok(productService.getProduct(id));
        }

}

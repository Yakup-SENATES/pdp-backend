package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class ProductDto {
        private Integer id, price;
        private String title, description, productHero;
        private List images;

}

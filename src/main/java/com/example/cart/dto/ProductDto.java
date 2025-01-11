package com.example.cart.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class ProductDto {
    private Long id;
    private String productId;
    private String name;
    private String description;
    private BigDecimal price;
    private int inventory;
    private String imageUrl;
    private CategoryDto category;
    private List<ImageDto> images;

}

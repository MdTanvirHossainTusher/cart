package com.example.cart.service.product;

import com.example.cart.dto.ProductDto;
import com.example.cart.entity.Product;

import java.util.List;

public interface IProductService {
    Product getProduct(String productId);
    List<Product> getAllProducts();
    Product addProduct(Product product);
    Product updateProduct(Product product);
    void deleteProduct(String productId);
}

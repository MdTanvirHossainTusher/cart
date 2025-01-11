package com.example.cart.controller;

import com.example.cart.converter.GenericConverter;
import com.example.cart.dto.ProductDto;
import com.example.cart.entity.Product;
import com.example.cart.response.ApiResponse;
import com.example.cart.service.product.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@Controller
@RestController
//@RequiredArgsConstructor
@RequestMapping("${api.prefix}/products")
public class ProductController {
    private final ProductService productService;
    private final GenericConverter genericConverter;

    public ProductController(ProductService productService, GenericConverter genericConverter) {
        this.productService = productService;
        this.genericConverter = genericConverter;
    }

    @GetMapping
    public ResponseEntity<ApiResponse> getAllProducts() {
        List<Product> allProducts = productService.getAllProducts();
        List<ProductDto> productDtos = genericConverter.convertToDtoList(allProducts, ProductDto.class);
//        return  ResponseEntity.ok(new ApiResponse("success", productDtos));
        return null;
    }

}

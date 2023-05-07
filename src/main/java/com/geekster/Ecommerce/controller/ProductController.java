package com.geekster.Ecommerce.controller;

import com.geekster.Ecommerce.model.ProductModel;
import com.geekster.Ecommerce.service.ProductService;
import jakarta.annotation.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping("/")
    public String addProduct(@RequestBody List<ProductModel> products) {
        return productService.addProduct(products);
    }

    @GetMapping("/products")
    public List<ProductModel> getProduct(@Nullable @RequestParam String category) {
        return productService.getProduct(category);
    }

    @DeleteMapping("/products/{productId}")
    public String removeProduct(@PathVariable Integer productId) {
        return productService.removeProduct(productId);
    }

}

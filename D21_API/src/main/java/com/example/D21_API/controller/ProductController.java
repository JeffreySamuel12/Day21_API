package com.example.D21_API.controller;

import com.example.D21_API.model.Product;
import com.example.D21_API.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products/{category}/{id}")
    public Product getProduct(@PathVariable String category, @PathVariable String id) {
        return productService.getProductByCategoryAndId(category, id);
    }
}

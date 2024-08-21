
package com.example.D21_API.service;

import com.example.D21_API.model.Product;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ProductService {

    private static final Map<String, Product> productRepository = new HashMap<>();

    static {
        productRepository.put("electronics-456", new Product("456", "electronics", "Smartphone", 699.99));
        productRepository.put("furniture-123", new Product("123", "furniture", "Chair", 49.99));
    }

    public Product getProductByCategoryAndId(String category, String id) {
        return productRepository.get(category + "-" + id);
    }
}

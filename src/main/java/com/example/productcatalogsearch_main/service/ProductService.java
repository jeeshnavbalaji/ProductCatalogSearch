package com.example.productcatalogsearch_main.service;

import com.example.productcatalogsearch_main.entity.Product;
import com.example.productcatalogsearch_main.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> searchByName(String name) {
        return productRepository.findByNameContaining(name);
    }

    public List<Product> searchByPriceRange(double price1, double price2) {
        return productRepository.findByPriceBetween(price1, price2);
    }

    public List<Product> searchByDescription(String description) {
        return productRepository.findByDescriptionContaining(description);
    }
}


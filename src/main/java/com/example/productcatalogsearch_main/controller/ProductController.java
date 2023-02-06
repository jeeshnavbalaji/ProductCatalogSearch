package com.example.productcatalogsearch_main.controller;

import com.example.productcatalogsearch_main.entity.Product;
import com.example.productcatalogsearch_main.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/search/name/{name}")
    public List<Product> searchByName(@PathVariable String name) {
        return productService.searchByName(name);
    }

    @GetMapping("/search/price/{price1}/{price2}")
    public List<Product> searchByPriceRange(@PathVariable double price1, @PathVariable double price2) {
        return productService.searchByPriceRange(price1, price2);
    }

    @GetMapping("/search/description/{description}")
    public List<Product> searchByDescription(@PathVariable String description) {
        return productService.searchByDescription(description);
    }
}


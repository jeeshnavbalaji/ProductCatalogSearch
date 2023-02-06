package com.example.productcatalogsearch_main.repository;

import com.example.productcatalogsearch_main.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findByNameContaining(String name);

    List<Product> findByPriceBetween(double price1, double price2);

    List<Product> findByDescriptionContaining(String description);
}


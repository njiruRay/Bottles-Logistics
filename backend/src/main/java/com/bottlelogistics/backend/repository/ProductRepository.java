package com.bottlelogistics.backend.repository;

import com.bottlelogistics.backend.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByActiveTrueOrderByDisplayOrderAsc();
}
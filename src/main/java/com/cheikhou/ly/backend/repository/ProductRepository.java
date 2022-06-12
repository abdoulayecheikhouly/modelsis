package com.cheikhou.ly.backend.repository;

import com.cheikhou.ly.backend.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}

package com.cheikhou.ly.backend.repository;

import com.cheikhou.ly.backend.entities.ProductType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TypeProductRepository extends JpaRepository<ProductType, Long> {
}

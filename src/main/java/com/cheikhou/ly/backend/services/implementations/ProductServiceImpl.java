package com.cheikhou.ly.backend.services.implementations;

import com.cheikhou.ly.backend.entities.Product;
import com.cheikhou.ly.backend.entities.ProductType;
import com.cheikhou.ly.backend.repository.ProductRepository;
import com.cheikhou.ly.backend.repository.TypeProductRepository;
import com.cheikhou.ly.backend.services.interfaces.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;
    private final TypeProductRepository typeProductRepository;


    @Override
    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }

    @Override
    public Product getProduct(Long id) {
        return productRepository.findById(id).get();
    }

    @Override
    public Product addProduct(Product product) {
        log.info("modelsis {}", product);
        return productRepository.save(product);
    }

    @Override
    public ProductType addTypeProduct(ProductType productType) {
        return typeProductRepository.save(productType);
    }

    @Override
    public List<ProductType> getAllProductType() {
        return typeProductRepository.findAll();
    }

    @Override
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);

    }
}

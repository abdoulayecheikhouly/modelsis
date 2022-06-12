package com.cheikhou.ly.backend.services.interfaces;


import com.cheikhou.ly.backend.entities.Product;
import com.cheikhou.ly.backend.entities.ProductType;

import java.util.List;

public interface ProductService {
    List<Product> getAllProduct();
    Product getProduct(Long id);
    Product addProduct(Product product);
    void deleteProduct(Long id);

    ProductType addTypeProduct(ProductType productType);
    List<ProductType> getAllProductType();
}

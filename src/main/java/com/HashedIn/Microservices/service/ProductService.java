package com.HashedIn.Microservices.service;


import com.HashedIn.Microservices.entity.Product;
import com.HashedIn.Microservices.repository.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ProductService {

    @Autowired
    private static ProductRepository productRepository;



    public Product saveProduct(Product product) {
        log.info("Inside Saveproduct of product service");
        return productRepository.save(product);
    }

    public static Product findProductById(Long productId) {
        return productRepository.findByProductId(productId);
    }
}

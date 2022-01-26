package com.HashedIn.Microservices.controller;

import com.HashedIn.Microservices.entity.Product;
import com.HashedIn.Microservices.repository.ProductRepository;
import com.HashedIn.Microservices.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
@Slf4j
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/")
    public Product saveProduct(@RequestBody Product product){

        log.info("Inside saveProduct method of Product Controller");
        return productService.saveProduct(product);
    }

    @GetMapping("/{id}")
    public Product findProductById(@PathVariable("id") Long  productId){
        log.info("Inside  findProductId method  of ProductController");
        return ProductService.findProductById(productId);
    }
}

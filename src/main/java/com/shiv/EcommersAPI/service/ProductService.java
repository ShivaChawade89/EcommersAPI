package com.shiv.EcommersAPI.service;

import com.shiv.EcommersAPI.model.Product;
import com.shiv.EcommersAPI.repo.IProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    IProductRepo productRepo;
    public Product addProduct(Product product) {
        return productRepo.save(product);
    }

    public List<Product> getAllProduct() {
        return productRepo.findAll();
    }

    public List<Product> getByCategory(String category) {
        return productRepo.findByCategory(category);
    }
}

package com.shiv.EcommersAPI.controller;

import com.shiv.EcommersAPI.model.Product;
import com.shiv.EcommersAPI.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    ProductService productService;

    @PostMapping("/")
    public Product addProduct(@RequestBody Product product){
        return productService.addProduct(product);
    }
    @GetMapping("/")
    public List<Product> getAllProduct(){
        return productService.getAllProduct();
    }

    @GetMapping("/getByCategory/{category}")
    public List<Product> getByCategory(String category){
        return productService.getByCategory(category);
    }

}

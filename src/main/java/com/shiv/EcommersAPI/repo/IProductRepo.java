package com.shiv.EcommersAPI.repo;

import com.shiv.EcommersAPI.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface IProductRepo extends JpaRepository<Product,Integer> {
    @Query(value = "SELECT * FROM product_tbl WHERE category = :category",nativeQuery = true)
    public List<Product> findAllProductByCategory(@PathVariable String category);

    public List<Product> findByCategory(@PathVariable String category);

}

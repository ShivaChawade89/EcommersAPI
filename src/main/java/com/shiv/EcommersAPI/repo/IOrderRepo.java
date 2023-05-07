package com.shiv.EcommersAPI.repo;


import com.shiv.EcommersAPI.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOrderRepo extends JpaRepository<Order,Integer> {
}

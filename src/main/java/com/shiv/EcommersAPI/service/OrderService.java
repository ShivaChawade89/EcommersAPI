package com.shiv.EcommersAPI.service;

import com.shiv.EcommersAPI.model.Order;
import com.shiv.EcommersAPI.repo.IOrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    IOrderRepo orderRepo;
    public Order getOrder(Integer id) {
        return orderRepo.findById(id).get();
    }

    public Order placeOrder(Order order) {
        return orderRepo.save(order);
    }
}

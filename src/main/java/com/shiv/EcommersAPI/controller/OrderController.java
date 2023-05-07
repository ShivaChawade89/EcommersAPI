package com.shiv.EcommersAPI.controller;

import com.shiv.EcommersAPI.model.Order;
import com.shiv.EcommersAPI.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("orders")

public class OrderController {
    @Autowired
    OrderService orderService;

    @GetMapping("/{id}")
    public Order getOrder(@PathVariable Integer id){
        return orderService.getOrder(id);
    }

    @PostMapping("/")
    public Order placeOrder(@RequestBody Order order){
        return orderService.placeOrder(order);
    }

}

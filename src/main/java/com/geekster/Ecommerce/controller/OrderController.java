package com.geekster.Ecommerce.controller;

import com.geekster.Ecommerce.model.OrderModel;
import com.geekster.Ecommerce.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class OrderController {

    @Autowired
    OrderService orderService;

    @PostMapping("/")
    public String addOrders(@RequestBody OrderModel order){
        return orderService.addOrders(order);
    }
    @GetMapping("/order")
    public OrderModel getOrders(@RequestParam Integer orderId){
        return orderService.getOrders(orderId);
    }
}

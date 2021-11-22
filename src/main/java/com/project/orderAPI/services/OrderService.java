package com.project.orderAPI.services;

import com.project.orderAPI.entities.Order;
import com.project.orderAPI.entities.User;
import com.project.orderAPI.repositories.OrderRepository;
import com.project.orderAPI.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> findAll(){
        return orderRepository.findAll();
    }

    public Order findById(Long id){
        Optional<Order> obj = orderRepository.findById(id);
        return obj.get();
    }
}

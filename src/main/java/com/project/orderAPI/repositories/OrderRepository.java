package com.project.orderAPI.repositories;

import com.project.orderAPI.entities.Order;
import com.project.orderAPI.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}

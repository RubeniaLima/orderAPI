package com.project.orderAPI.repositories;

import com.project.orderAPI.entities.OrderItem;
import com.project.orderAPI.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}

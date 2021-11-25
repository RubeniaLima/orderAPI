package com.project.orderAPI.repositories;

import com.project.orderAPI.entities.Product;
import com.project.orderAPI.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}

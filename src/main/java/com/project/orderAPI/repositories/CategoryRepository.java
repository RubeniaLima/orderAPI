package com.project.orderAPI.repositories;

import com.project.orderAPI.entities.Category;
import com.project.orderAPI.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}

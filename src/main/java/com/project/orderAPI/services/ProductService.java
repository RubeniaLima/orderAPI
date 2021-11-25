package com.project.orderAPI.services;

import com.project.orderAPI.entities.Product;
import com.project.orderAPI.entities.User;
import com.project.orderAPI.repositories.ProductRepository;
import com.project.orderAPI.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll(){
        return productRepository.findAll();
    }

    public Product findById(Long id){
        Optional<Product> obj = productRepository.findById(id);
        return obj.get();
    }
}

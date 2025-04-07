package com.ravi.kalyani.small_basket.repository;


import com.ravi.kalyani.small_basket.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}

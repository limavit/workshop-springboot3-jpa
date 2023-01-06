package com.vitor.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vitor.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}

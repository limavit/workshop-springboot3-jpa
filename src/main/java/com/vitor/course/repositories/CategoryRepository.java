package com.vitor.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vitor.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}

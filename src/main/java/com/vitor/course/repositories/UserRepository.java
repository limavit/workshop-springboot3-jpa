package com.vitor.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vitor.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}

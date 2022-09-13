package com.example.books.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.books.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);
}

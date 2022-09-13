package com.example.books.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.books.entity.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author,String>{

	public Author getByName(String name);

}

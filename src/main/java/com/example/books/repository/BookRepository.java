package com.example.books.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.books.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book,String> {
	public Book getByIsbn(String isbn);
}

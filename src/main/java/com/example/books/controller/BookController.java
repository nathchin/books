package com.example.books.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.books.entity.Book;
import com.example.books.service.BookService;



@RestController
@RequestMapping("/book")
public class BookController {
	private static Logger log = LoggerFactory.getLogger(BookController.class);

	@Autowired
	private BookService bookService;
	
	@PostMapping("/create")
	private ResponseEntity<Book> createBook(@RequestBody Book book) {
		log.info("Creat book "+book.getIsbn());
		return ResponseEntity.ok(bookService.create(book));
	}
	
	@GetMapping("/{isbn}")
	private ResponseEntity<Book> getBookByIsbn(@PathVariable String isbn) {
		log.info("Get Book by isbn "+isbn);
		return ResponseEntity.ok(bookService.getBookByIsbn(isbn));
	}
	
	@PostMapping("/update")
	private ResponseEntity<Book> updateBook(@RequestBody Book book) {
		log.info("Update Book "+book.getIsbn());
		return ResponseEntity.ok(bookService.update(book));
	}
	
	@PostMapping("/delete")
	private ResponseEntity<?> deleteBook(@RequestBody Book book) {
		log.info("Delete Book by isbn "+book.getIsbn());
		return ResponseEntity.noContent().build();
	}
	
	@GetMapping("/all")
	private ResponseEntity<List<Book>> getAll() {
		return ResponseEntity.ok(bookService.getAll());
	}
}

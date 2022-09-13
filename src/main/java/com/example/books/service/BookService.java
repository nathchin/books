package com.example.books.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.books.entity.Book;
import com.example.books.repository.BookRepository;

@Service
public class BookService {
	
	@Autowired
	AuthorService authorService;
	
	@Autowired
	BookRepository bookRepository;
	
	private static Logger log = LoggerFactory.getLogger(BookService.class);
	
	public Book create(Book book) {
		Book savedBook = new Book();
		try {
			savedBook = bookRepository.save(book);
		} catch (Exception ex) {
			log.error(ex.getMessage());
			log.debug(ex.getMessage());
			
		}
		return savedBook;
	}
	
	public Book getBookByIsbn(String isbn) {
		Book book = new Book();
		try {
			book = bookRepository.getByIsbn(isbn);
		} catch (Exception ex) {
			log.error(ex.getMessage());
			log.debug(ex.getMessage());
		}
		return book;
	}
	
	public Book update(Book book) {
		Book updatedBook = new Book();
		try {
			updatedBook = bookRepository.save(book);
		} catch (Exception ex) {
			log.error(ex.getMessage());
			log.debug(ex.getMessage());
		}
		return updatedBook;
	}
	
	public void delete(String isbn) {
		try {
			bookRepository.deleteById(isbn);;
		} catch (Exception ex) {
			log.error(ex.getMessage());
			log.debug(ex.getMessage());
		}
	}
	
	public List<Book> getAll() {
		List<Book> books = new ArrayList<>();
		try {
			books = bookRepository.findAll();
			books.forEach(book -> {
				log.debug(book.getTitle());
				book.getAuthors().forEach( author -> log.debug(author.getName()));
			});
			
		} catch (Exception ex) {
			log.error(ex.getMessage());
			log.debug(ex.getMessage());
		}
		return books;
	}
}

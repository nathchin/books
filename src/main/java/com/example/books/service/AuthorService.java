package com.example.books.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.books.entity.Author;
import com.example.books.repository.AuthorRepository;

@Service
public class AuthorService {
	
	@Autowired
	private AuthorRepository authorRepository;
	
	private static Logger log = LoggerFactory.getLogger(BookService.class);
	
	public Author create(Author author) {
		Author savedAuthor = new Author();
		try {
			savedAuthor = authorRepository.save(author);
		} catch (Exception ex) {
			log.error(ex.getMessage());
			log.debug(ex.getMessage());
		}
		return savedAuthor;
	}
	
	public Author getByAuthorName(String name) {
		Author savedAuthor = new Author();
		try {
			savedAuthor = authorRepository.getByName(name);
		} catch (Exception ex) {
			log.error(ex.getMessage());
			log.debug(ex.getMessage());
		}
		return savedAuthor;
	}
	
	public Author update(Author author) {
		Author savedAuthor = new Author();
		try {
			savedAuthor = authorRepository.save(author);
		} catch (Exception ex) {
			log.error(ex.getMessage());
			log.debug(ex.getMessage());
		}
		return savedAuthor;
	}
	
	public void delete(Author author) {
		try {
			authorRepository.deleteById(author.getName());;
		} catch (Exception ex) {
			log.error(ex.getMessage());
			log.debug(ex.getMessage());
		}
	}
	
	public List<Author> getAll() {
		return authorRepository.findAll();
	}
	
	
}

package com.example.books.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.books.entity.Author;
import com.example.books.entity.Book;
import com.example.books.service.AuthorService;



@RestController
@RequestMapping("/author")
public class AuthorController {
	
	private static Logger log = LoggerFactory.getLogger(AuthorController.class);
	
	@Autowired
	private AuthorService authorService;
	
	@PostMapping("/create")
	public ResponseEntity<Author> create (@RequestBody Author author) {
		log.debug("Create author "+author.getName());
		System.out.println("Create author "+author.getName() + author);
		return ResponseEntity.ok(authorService.create(author));
	}
	
	@PostMapping("/getAuthorByName")
	public ResponseEntity<Author> getByAuthorName (@RequestBody Author author) {
		log.info("Get Author "+author.getName());
		return ResponseEntity.ok(authorService.getByAuthorName(author.getName()));
	}
	
	@PostMapping("/update")
	ResponseEntity<Author> update (@RequestBody Author author) {
		log.info("Update athor "+author.getName());
		return ResponseEntity.ok(authorService.update(author));
	}
	
	@PostMapping("/delete")
	ResponseEntity<Author> delete (@RequestBody Author author) {
		log.info("Delete author "+author.getName());
		authorService.delete(author);
		return ResponseEntity.noContent().build();
	}
	
	@GetMapping("/all")
	ResponseEntity<List<Author>> getAll () {
		log.info("Get all authors ");
		return ResponseEntity.ok(authorService.getAll());
	}
	

}

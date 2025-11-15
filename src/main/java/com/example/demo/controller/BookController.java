// book controller
package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin; // New Import
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Book;
import com.example.demo.entity.Library;
import com.example.demo.service.BookService;


@RestController
public class BookController {
// ... (rest of the code remains the same)

@Autowired
BookService bookService;

@GetMapping("book/genre/{genre}")
	public ResponseEntity findByGenre(@PathVariable String genre) { // **ADDED @PathVariable**
		// TODO Auto-generated method stub
		return new ResponseEntity(bookService.findByGenre(genre),HttpStatus.OK);
	}

@GetMapping("book/publishedYear/{publishedYear}")
	public ResponseEntity findByPublishedYear(@PathVariable int publishedYear) { // **ADDED @PathVariable**
		// TODO Auto-generated method stub
		return new ResponseEntity(bookService.findByPublishedYear(publishedYear),HttpStatus.OK);
	}

@GetMapping("book/borrowed/{borrowed}")
	public ResponseEntity findByBorrowed(@PathVariable String borrowed) { // **ADDED @PathVariable**
		// TODO Auto-generated method stub
		return new ResponseEntity(bookService.findByBorrowed(borrowed),HttpStatus.OK);
	}

@PostMapping("book/{lib_id}")
	public ResponseEntity addBook(@RequestBody Book b,  @PathVariable int lib_id) {
		bookService.addBook(b, lib_id);
		return new ResponseEntity(HttpStatus.OK);

	}

@GetMapping("book")
	public ResponseEntity getBooks() {
		// TODO Auto-generated method stub
		return new ResponseEntity(bookService.getBooks(),HttpStatus.OK);
	}
}
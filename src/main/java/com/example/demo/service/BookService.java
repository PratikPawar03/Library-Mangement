 package com.example.demo.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Book;

public interface BookService {
	List<Book> findByGenre(String genre);
	List<Book> findByPublishedYear(int publishedYear);
	List<Book> findByBorrowed(String borrowed);
	
	void addBook(Book b,int lib_id);
	List<Book> getBooks();
	
	

}

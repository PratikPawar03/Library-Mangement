package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Book;
import com.example.demo.entity.Library;
import com.example.demo.repository.BookRepository;
import com.example.demo.repository.LibraryRepository;

@Service
public class BookServiceImpl implements BookService{

	@Autowired
	BookRepository bookRepository;
	
	@Autowired
	LibraryRepository libraryRepository;
	
	@Override
	public List<Book> findByGenre(String genre) {
		// TODO Auto-generated method stub
		return bookRepository.findByGenre(genre);
	}

	@Override
	public List<Book> findByPublishedYear(int publishedYear) {
		// TODO Auto-generated method stub
		return bookRepository.findByPublishedYear(publishedYear);
	}

	@Override
	public List<Book> findByBorrowed(String borrowed) {
		// TODO Auto-generated method stub
		return bookRepository.findByBorrowed(borrowed);
	}

	@Override
	public void addBook(Book b, int lib_id) {
		// TODO Auto-generated method stub
		bookRepository.save(b);
		Library l= libraryRepository.findById(lib_id).get();
		b.setLibrary(l);
		
		bookRepository.save(b);
	}

	@Override
	public List<Book> getBooks() {
		// TODO Auto-generated method stub
		return bookRepository.findAll();
	}


}

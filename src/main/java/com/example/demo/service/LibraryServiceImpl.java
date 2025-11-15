package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.LibraryDto;
import com.example.demo.entity.Book;
import com.example.demo.entity.Library;
import com.example.demo.repository.BookRepository;
import com.example.demo.repository.LibraryRepository;

@Service
public class LibraryServiceImpl implements LibraryService{
	@Autowired
	LibraryRepository libraryRepository;
	
	@Autowired
	BookRepository bookRepository;
	@Override
	public void addLibrary(LibraryDto libraryDto) {
		
		
		// TODO Auto-generated method stub
		Library l=new Library();
		l.setName(libraryDto.getName());
		l.setLocation(libraryDto.getLocation());
		l.setEstablishedYear(libraryDto.getEstablishedYear());
		
		Library l2= libraryRepository.save(l);
		List<Book> book= libraryDto.getBook();
		for(Book book1: book) {
			book1.setLibrary(l2);
			bookRepository.save(book1);
		}
	
	}

	@Override
	public Library getLibrary(int id) {
		// TODO Auto-generated method stub
		return libraryRepository.findById(id).get();
	}

	@Override
	public List<Library> findByLocation(String location) {
		// TODO Auto-generated method stub
		return libraryRepository.findByLocation(location);
	}

	@Override
	public List<Library> findByEstablishedYear(int establishedYear) {
		// TODO Auto-generated method stub
		return libraryRepository.findByEstablishedYear(establishedYear);
	}

	
	

}	
	
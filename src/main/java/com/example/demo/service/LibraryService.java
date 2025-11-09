package com.example.demo.service;

 
import com.example.demo.dto.LibraryDto;
import com.example.demo.entity.Book;
import com.example.demo.entity.Library;

public interface LibraryService {
void addLibrary(LibraryDto libraryDto);
Library getLibrary(int id);
void addBook(Book book, int id);
Book findByLocation(String location);
Book findByEstablishedYear(int establishedYear);

}

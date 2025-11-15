package com.example.demo.service;

 
import java.util.List;

import com.example.demo.dto.LibraryDto;
import com.example.demo.entity.Book;
import com.example.demo.entity.Library;

public interface LibraryService {
void addLibrary(LibraryDto libraryDto);
Library getLibrary(int id);
List<Library> findByLocation(String location);
List<Library> findByEstablishedYear(int establishedYear);

}

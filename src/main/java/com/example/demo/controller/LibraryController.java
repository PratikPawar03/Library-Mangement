// library controller
package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.graphql.GraphQlProperties.Http;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin; // New Import
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.LibraryDto;
import com.example.demo.entity.Library;
import com.example.demo.service.LibraryService;

// **ADDED @CrossOrigin(origins = "*")**
@CrossOrigin(origins = "*")
@RestController
public class LibraryController {
// ... (rest of the code remains the same)

	@Autowired
	LibraryService libraryService;

	@PostMapping("library")
	public ResponseEntity addLibrary(@RequestBody LibraryDto dto) {
		libraryService.addLibrary(dto);
		return new ResponseEntity("Saved", HttpStatus.ACCEPTED);
	}
	
	@GetMapping("library/{id}")
	public Library getLibraryService(@PathVariable int id) {
		return libraryService.getLibrary(id);
	}
	
	@GetMapping("library/location/{location}")
	public List<Library> findByLocation(@PathVariable String location) {
		// TODO Auto-generated method stub
		return libraryService.findByLocation(location);
	}

	@GetMapping("library/year/{year}")
	public List<Library> findByEstablishedYear(@PathVariable int establishedYear) {
		// TODO Auto-generated method stub
		return libraryService.findByEstablishedYear(establishedYear);
	}
}
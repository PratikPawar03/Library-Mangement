package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Library;

public interface LibraryRepository extends JpaRepository<Library, Integer>{

	List<Library> findByLocation(String location);
	List<Library> findByEstablishedYear(int establishedYear);
	
}

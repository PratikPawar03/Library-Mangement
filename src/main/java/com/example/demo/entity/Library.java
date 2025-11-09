package com.example.demo.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Library {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;

private String name;

private String location;

private int establishedYear;

@OneToMany(mappedBy = "library")
private List<Book> book;

public List<Book> getBook() {
	return book;
}

public void setBook(List<Book> book) {
	this.book = book;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getLocation() {
	return location;
}

public void setLocation(String location) {
	this.location = location;
}

public int getEstablishedYear() {
	return establishedYear;
}

public void setEstablishedYear(int establishedYear) {
	this.establishedYear = establishedYear;
}


	
	
}

package com.example.demo.repository;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Book;

//import java.util.*;

public interface BookRepository 
		extends JpaRepository<Book, Integer> {

	//List<Book> findByBookName(String name);
}

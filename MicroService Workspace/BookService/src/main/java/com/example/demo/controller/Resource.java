package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Book;

@RestController
@RequestMapping("/book")
public class Resource {
	
	
	@GetMapping("/{bookId}")
	public Book getBookDetaails(@PathVariable String bookId){
		System.out.println("Got my req");
		return new Book("One","Two","Three");
		
	}

}

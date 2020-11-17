package com.example.demo.controller;

import java.awt.PageAttributes.MediaType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import javax.print.attribute.standard.Media;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.Book;
import com.example.demo.model.Catalog;
import com.example.demo.model.Rating;
import com.example.demo.model.UserRating;
import com.fasterxml.jackson.annotation.JsonValue;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping("/details")
public class Resource {

	@Autowired
	RestTemplate restTemplate;

	@GetMapping(value = "/{userId}", produces = { "application/json" })
	@HystrixCommand(fallbackMethod = "fallback")
	public List<Catalog> getBooks(@PathVariable String userId) {

		UserRating rating = restTemplate.getForObject("http://rating-service/rating/userRating/kk", UserRating.class);

		return rating.getUserRating().stream().map(r -> {
			System.out.println(r);
			Book book = restTemplate.getForObject("http://book-service/book/" + r.getBookId(), Book.class);
			System.out.println(book);
			return new Catalog(book.getBookname(), book.getBookauthor(), r.getRating());
		}).collect(Collectors.toList());

	}
	
	public List<Rating> getUserRating(String userId){
		return  (List<Rating>) restTemplate.getForObject("http://rating-service/rating/userRating/"+userId, UserRating.class);
	}
	
//	
//	public List<E>
//	}
	
	
	
	
	
	
	
	
	
//	ArrayList<Catalog> list = new ArrayList<Catalog>();
//	for(Rating r: rating) {
//		System.out.println(r);
//		Book book = restTemplate.getForObject("http://localhost:8081/book/"+r.getBookId(), Book.class);
//		System.out.println(book);
//		list.add(new Catalog( book.getBookname(), book.getBookauthor(), r.getRating() ));
//		System.out.println("ADDED");		
//	}
//	System.out.println(list);
//	return list;

//	return Collections.singletonList(new Book("IdOne","BookOne","OneAuth"));

}

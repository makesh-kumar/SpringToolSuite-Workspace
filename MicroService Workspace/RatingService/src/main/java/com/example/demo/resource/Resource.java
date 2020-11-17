package com.example.demo.resource;

import java.util.Arrays;
import java.util.List;

import org.apache.tomcat.util.digester.ArrayStack;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Rating;
import com.example.demo.model.UserRating;

@RestController
@RequestMapping("/rating")
public class Resource 
{
	@GetMapping("{bookId}")
	public Rating getRating(@PathVariable String bookId) {
		return new Rating(bookId,"33");
	}
	
	@GetMapping("/userRating/{userId}")
	public UserRating getUserRating(@PathVariable String userId){
		List<Rating> ratings = Arrays.asList(
				new Rating("Book1","22"),
				new Rating("Book2","34"),
				new Rating("Book3","52"),
				new Rating("Book4","92")
				);
		return new UserRating(ratings);
	}

}

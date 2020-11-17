package com.demo;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ReqController {

	
	@Autowired
	UserRepo repo;
	
	@RequestMapping("/add")
	public void addUser(@Valid @RequestBody User u) {
//		int r = (int) (Math.random() * (1000 - 100 + 1) + 100);
//		User u = new User(r+"Z", null, 11, "wwe");	
		repo.save(u);
	}
}

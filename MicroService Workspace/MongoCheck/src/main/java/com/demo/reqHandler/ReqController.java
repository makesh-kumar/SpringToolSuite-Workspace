package com.demo.reqHandler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.User;
import com.demo.repository.UserRepo;

@RestController
public class ReqController {

	
	@Autowired
	UserRepo repo;
	
	@RequestMapping("/add")
	public void addUser() {
		int r = (int) (Math.random() * (1000 - 100 + 1) + 100);
		User u = new User(r+"Z", "Makesh", 11, "wwe");	
		repo.save(u);
	}
}

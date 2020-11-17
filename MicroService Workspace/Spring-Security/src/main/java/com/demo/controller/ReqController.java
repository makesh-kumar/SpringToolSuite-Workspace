package com.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReqController {

	
	@RequestMapping("/")
	public String ind() {
		return "<h3>Hello World</h2>";
	}
	
	@RequestMapping("/admin")
	public String admin() {
		return "<h3>Hello Admin</h2>";
	}
	
	@RequestMapping("/user")
	public String user() {
		return "<h3>Hello User</h2>";
	}
}

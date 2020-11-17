package com.example.demo.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class ApiController {

	@RequestMapping(value = "/getData", method = RequestMethod.GET,
			produces = { "application/json", "application/xml" })
	public List<Model> getData(){
		
		Model m1 = new Model("INC10055", "aaa@aaa.com", "yes","orderStatus");
		Model m2= new Model("INC200", "bbb@bbb.com", "yes","other");
		Model m3 = new Model("INC300", "ccc@ccc.com", "no","orderStatus");
		Model m4 = new Model("INC400", "ddd@ddd.com", "yes","other");
		List<Model> l = new ArrayList<Model>();
		l.add(m1);	l.add(m2);	l.add(m3); l.add(m4);
		return l;
		
	}
	
	@RequestMapping("/approved/{inc_no}")
	public String approved(@PathVariable String inc_no) {
		return "Inc No :"+inc_no+" Resolved";
	}
	@RequestMapping("/rejected/{inc_no}")
	public String rejected(@PathVariable String inc_no) {
		return "Inc No :"+inc_no+" Not Resolved";
	}
}

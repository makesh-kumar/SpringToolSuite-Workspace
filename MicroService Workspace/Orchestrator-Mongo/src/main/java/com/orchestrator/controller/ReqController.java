package com.orchestrator.controller;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.orchestrator.model.Comp;
import com.orchestrator.model.Status;
import com.orchestrator.repository.StatusRepo;

@RestController
public class ReqController {

	
	@Autowired
	private StatusRepo repo;
	
	@RequestMapping("/load")
	public String load() {
		
		Status s = new Status(100, "ytuy", "mailid", "spocid", "movehr", "res");
		repo.save(s);
		return"loaded..";
	}
	
	
	
	@PostMapping("/update")
	public Comp update(@RequestBody Comp c)
	{
		
		System.out.println(c);
		System.out.println("Next");


//		repo.save(status);
//		System.out.println("comp - "+c);
		Status s = repo.findByTicNo(c.getTicNo());
		if(s==null) {
			System.out.println("IN NULL");

			Status status = new Status();
			Random rd = new Random(); // creating Random object
		      System.out.println(rd.nextInt());
			status.setId(rd.nextInt());
			status.setTicNo(c.getTicNo());
			status.setEmail("unknown");status.setHour("unknown"); status.setResult("unknown"); status.setSpoc("unknown");
			if(c.getCompName().equals("Email")) status.setEmail(c.getStatus());
			if(c.getCompName().equals("Spoc")) status.setSpoc(c.getStatus());
			if(c.getCompName().equals("Hour"))status.setHour(c.getStatus());
			if(c.getCompName().equals("Result")) status.setResult(c.getStatus());
			System.out.println("GNG TO SAVE");
			repo.save(status);
//			System.out.println("null");
		}
		else {
			System.out.println("In else");
			if(c.getCompName().equals("Email")) s.setEmail(c.getStatus());
			if(c.getCompName().equals("Spoc")) s.setSpoc(c.getStatus());
			if(c.getCompName().equals("Hour"))s.setHour(c.getStatus());
			if(c.getCompName().equals("Result")) s.setResult(c.getStatus());
			System.out.println("S->"+s);
			repo.save(s);
		}
	
//		
		return c;
	}
	
	
	
}

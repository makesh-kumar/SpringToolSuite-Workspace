package com.example.demo.api;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.employee;

@RestController
public class checkCases 
{

	
	@RequestMapping("")
	public void check() {
	System.out.println("METH CALd");
	
	RestTemplate restTemplate = new RestTemplate();
	ResponseEntity<List<Model>> rateResponse =
	        restTemplate.exchange("http://localhost:8080/getData",
	                    HttpMethod.GET, null, new ParameterizedTypeReference<List<Model>>() {
	            });
	List<Model> rates = rateResponse.getBody();
	
	System.out.println(rates);

	
//    final String uri = "http://localhost:8080/getData";
//    RestTemplate restTemplate = new RestTemplate();
//     
//    List<Model> result = (List<Model>) restTemplate.getForObject(uri, Model.class);
//     
//    System.out.println(result);
//		
	}
}

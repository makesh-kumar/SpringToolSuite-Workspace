package com.demo.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.AuthRequest;
import com.demo.model.AuthResponse;
import com.demo.websecurity.JwtUtill;

@RestController
public class ReqController {

	@Autowired 
	AuthenticationManager authManager;
	
	@Autowired
	UserDetailsService userDetailServ;
	
//	@Autowired
//	JwtUtill jwtUtill;
	
	@RequestMapping("/hello")
	public String hello() {
		return "Hii,I'm OK!";
	}
	
	@PostMapping("/auth")
	public ResponseEntity<?> auth(@RequestBody AuthRequest req) throws Exception {
		System.out.println("IN A");
		try {
			System.out.println("IM TRYING");
			authManager.authenticate(new UsernamePasswordAuthenticationToken(req.getUserName(), req.getPassword()));
		}
		catch (Exception e) {
			// TODO: handle exception
			throw new Exception("Username/Password Wrong",e);
		}
		
		UserDetails userDetail = userDetailServ.loadUserByUsername(req.getUserName());
		
		JwtUtill jwtUtill = new JwtUtill();
		String jwt = jwtUtill.generateToken(userDetail);
	
		return ResponseEntity.ok(new AuthResponse(jwt));
	}
}

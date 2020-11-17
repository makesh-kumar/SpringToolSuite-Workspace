package com.orchestrator;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

public class FirstScript
{
//
//	 @Autowired
//	    private WebDriver webDriver;
	 
	@RequestMapping("/test")
	public void scp() {
		System.out.println("in method");
//		webDriver.get("https://www.google.com");
		
	}

}

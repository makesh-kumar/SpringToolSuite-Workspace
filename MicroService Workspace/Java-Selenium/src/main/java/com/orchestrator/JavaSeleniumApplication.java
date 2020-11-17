package com.orchestrator;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.annotation.PostConstruct;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.orchestrator.excel.ReadData;
import com.orchestrator.excel.Updatedata;

@SpringBootApplication
public class JavaSeleniumApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaSeleniumApplication.class, args);
	}
	
//	@Bean
//	public WebDriver webDriver() {
////	    return new FirefoxDriver(
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\91909\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
//	     return new ChromeDriver();
//	}
	   @PostConstruct
	    private void init() throws InterruptedException
	   {
		   
		   ReadData d = new ReadData();
		 List<String> l =   d.fetchOneData();
		 for(String s: l) {
			 openBrowser(s);
			 
//			 Updatedata u = new Updatedata();
//			 List<String> ls = new ArrayList<String>();ls.add("sss"); ls.add("wfwf");
//			 u.updateStatus(s, ls);
			 
			 
		 }
		 
		 System.out.println("Process over");
//		   Updatedata u = new Updatedata();
//		   u.updateStatus();

//	           int count = 0;
//	           while(!driver.findElements(By.xpath("span[contains(text(),'NEXT')]")).isEmpty()) {
//	        	   System.out.println(count++);
//	           }
//	           
	           
	           
	           
	           
//	           
//	           
////	           driver.findElementByLinkText("Next").click();
//	           String t = driver.findElement(By.className("_3wU53n")).getText();
//	           System.out.println(t);
//	           
////	         List<WebElement> list =  driver.findElements(By.xpath("//div[@id=\"container\"]//div[@class=\"_3wU53n\"]"));
//	           List<WebElement> list =  driver.findElements(By.className("_2Xp0TH"));
	         
//	         for(WebElement webElement:list) {
////	        	 System.out.println(webElement.getText());
//	        	  List<WebElement> it =  driver.findElements(By.xpath("//div[@id=\"container\"]//div[@class=\"_3wU53n\"]"));
//	        	  for(WebElement w:it) {
//	        		  System.out.println(w.getText());
//	        	  }
	        	  
	        	 
//	        	 webElement.click();
	         }
	   
	   
	   
	   public void openBrowser(String search) throws InterruptedException {

		 
		 
		 
		 
		 
           
           System.setProperty("webdriver.chrome.driver","C:\\Users\\91909\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
        
           
           ChromeOptions options = new ChromeOptions();
           // setting headless mode to true.. so there isn't any ui
           options.setHeadless(true);
          
           ChromeDriver driver = new ChromeDriver(options);
           
           
          driver.get("https://www.flipkart.com");
          driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
          //Login
          WebElement userId = driver.findElement(By.className("_2zrpKA"));
          userId.sendKeys("9095774441");  
          driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

          WebElement pass = driver.findElement(By.className("_3v41xv"));
          pass.sendKeys("01041997");
          Thread.sleep(5000);
       
          WebElement LoginBtn = driver.findElement(By.className("_1LctnI"));
          LoginBtn.click();
          Thread.sleep(5000);
          driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

          //Search
          WebElement searchBox = driver.findElement(By.name("q"));
          searchBox.sendKeys(search);  
          searchBox.sendKeys(Keys.ENTER);
          Thread.sleep(5000);
         
          int flag = 1;
          int count = 1;
          List<String> res = new ArrayList<String>();
          while(true) {

       	      Thread.sleep(1000);
         List<WebElement> e = driver.findElements(By.className("_3fVaIS")); 
   
         if(e.size()==1 && flag ==1) {

       	 List<WebElement> it =  driver.findElements(By.className("_3wU53n"));
       	 for(WebElement ii: it) {
       		 res.add(ii.getText());
//       		 System.out.println(ii.getText());
       	 }
      
//       	  System.out.println("Size - 0");
//       	  System.out.println(e.get(0).getText());
       	  e.get(0).click();
       	  flag =2;
         }
         else if(e.size()==1 && flag!=1) {

       	  List<WebElement> it =  driver.findElements(By.className("_3wU53n"));
	        	 for(WebElement ii: it) 
	        	 {
	        		 res.add(ii.getText());
//	        		 System.out.println(ii.getText());	  
	        	 }
       	  
       	  
       	  
       	  break;}
         else {
      
       	  List<WebElement> it =  driver.findElements(By.className("_3wU53n"));
	        	 for(WebElement ii: it) 
	        	 {
	        		 res.add(ii.getText());
//	        		 System.out.println(ii.getText());
	        	 }
//       	  System.out.println("Size -1 ");
//       	  System.out.println(e.get(1).getText());
       	  e.get(1).click();
         }
          }
          
          Updatedata d = new Updatedata();
          d.updateStatus(search, res);
          
          driver.quit();
		   
	   }
	         
	         
//	           webDriver.close();
	           
	    }


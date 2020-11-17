package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.omg.CORBA.Any;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

@RestController
@CrossOrigin("*")
public class controller 
{
	
	@GetMapping(value = "/getdata",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<employee> get() {
		
		System.out.println("*** Data Sent ***");
		List<employee> l = new ArrayList<employee>();
		employee emp1 = new employee("  ","makeshthemass@gmail.com", "yes");
		employee emp2 = new employee("2000","email_id_two@gmail.com", "no");
		employee emp3 = new employee("3000","mynameismakesh@gmail.com", "yes");
		employee emp4 = new employee("4000","email_id_four@gmail.com", "no");
		employee emp5 = new employee("5000","makesh.ece.070@gmail.com", "yes");
		l.add(emp1);l.add(emp2);l.add(emp3);l.add(emp4);l.add(emp5);
		return l;
	}
	
	@RequestMapping("/dd/{id}")
	public String dd(@PathVariable String id) {
		System.out.println("Error -->"+id);
		return "OKK";
	}
	
	
	@RequestMapping("approve/{id}")
	public String approve(@PathVariable String id) {
		
		
		
		
		  CkHttp http = new CkHttp();

		    //  If SharePoint Windows classic authentication is used, then set the
		    //  Login, Password, LoginDomain, and NtlmAuth properties.
		    http.put_Login("SHAREPOINT_USERNAME");
		    http.put_Password("SHAREPOINT_PASSWORD");
		    http.put_LoginDomain("SHAREPOINT_NTLM_DOMAIN");
		    http.put_NtlmAuth(true);

		    //  -------------------------------------------------------------------------
		    //  The more common case is to use SharePoint Online authentication (via the SPOIDCRL cookie).
		    //  If so, do not set Login, Password, LoginDomain, and NtlmAuth, and instead
		    //  establish the cookie as shown at SharePoint Online Authentication
		    //  -------------------------------------------------------------------------

		    //  This example downloads the file named "Domain Name created for Exchange.docx"

		    //  Note: I was initially confused by the "$value" part of the URL.
		    //  When I see something like $value, I immediately think that it's some sort of
		    //  variable or placeholder to be replaced with an actual value.  In this case,
		    //  the "$value" is literally part of the URL.  It's not replace with anything.

		    String url = "https://SHAREPOINT_HTTPS_DOMAIN/_api/web/GetFolderByServerRelativeUrl('/Documents')/Files('Domain Name created for Exchange.docx')/$value";
		    String localFilePath = "qa_output/x.docx";

		    boolean success = http.Download(url,localFilePath);
		    if (success != true) {
		        System.out.println(http.lastErrorText());
		        return "";
		        }

		    System.out.println("File successfully downloaded from SharePoint.");
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println(id+" - Approved");
		return id+" - Approved";
	}
	@PostMapping("/send/{id}/{approve}/{reject}")
	public String send(@PathVariable String id,@PathVariable String approve,@PathVariable String reject) throws JsonMappingException, JsonProcessingException {
		
		ObjectMapper mapper = new ObjectMapper();
		List<employee> list = mapper.readValue(id, new TypeReference<List<employee>>(){});
		System.out.println("Approve URL : "+approve);
		System.out.println("Reject URL : "+reject);
		for (int i = 0; i < list.size(); i++) {
		    System.out.println(list.get(i));
		}
		return "OK";
	}
	
	
	@PostMapping("/ss/{ss}")
	public void ss(@PathVariable String ss) {
		System.out.println(ss);
	}
	
	
	
	
	
	
	
	
	
@RequestMapping("/gert")
	public Object call() {
	
	System.out.println("METH CALd");
    final String uri = "http://newsapi.org/v2/top-headlines?country=in&apiKey=072b62dc3937448f97f96d362878e22d";
    RestTemplate restTemplate = new RestTemplate();
     
//    employee result = restTemplate.getForObject(uri, employee.class);
    Object result = restTemplate.getForObject(uri, Object.class);
     
    System.out.println(result);
    return result;
		
	}















}

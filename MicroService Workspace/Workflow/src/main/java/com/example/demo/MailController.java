package com.example.demo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.ComplexMail;
import com.example.demo.model.SimpleMail;
import com.example.demo.services.SimpleNotification;

/**
 * @author Makesh Kumar
 *
 */

@RestController
public class MailController 
{

	SimpleNotification simpleNoti;
	
	//To send simple email(only with subject & body)
	@PostMapping("sendSimpleMail")
	public String sendSimpleMail(@RequestBody SimpleMail mail) {
		simpleNoti.sendSimpleNotification(mail);
		return "Mail Sent to - "+mail.getTo();
	}
	
	//To send complex email(with approve/reject button to call api's)
	@PostMapping("sendComplexMail")
	public String sendComplexMail(@RequestBody ComplexMail mail) {
		simpleNoti.sendComplexNotification(mail);
		return "Mail Sent to - "+mail.getTo();
	}
	
	
}

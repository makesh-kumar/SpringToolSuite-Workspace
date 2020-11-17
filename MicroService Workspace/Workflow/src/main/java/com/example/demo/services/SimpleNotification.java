package com.example.demo.services;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import com.example.demo.model.ComplexMail;
import com.example.demo.model.SimpleMail;

/**
 * @author Makesh Kumar
 *
 */

@Service
public class SimpleNotification {
	
	private JavaMailSender javaMailSender;

	@Autowired
	public SimpleNotification(JavaMailSender javaMailSender) {
		this.javaMailSender = javaMailSender;
	}

	public void sendSimpleNotification(SimpleMail mail) throws MailException {

		
		MimeMessage message = javaMailSender.createMimeMessage();

		try {
			MimeMessageHelper helper = new MimeMessageHelper(message, true);
			
			helper.setFrom("mynameismakesh@gmail.com");
			helper.setTo(mail.getTo());
			helper.setSubject(mail.getSub());
			helper.setText(mail.getBody());

			

		
		try {
			javaMailSender.send(message);
			System.out.println("\t Email sent successfully !");
		}
		
		catch (Exception e) {

			System.out.println("!!!   Error in Sending Mail   !!!");
			System.out.println("This may due to invalid email id or password");
			System.out.println("---------xxxxxxx---------");
			System.out.println();
		}
		
	}
		catch (Exception e) {
			// TODO: handle exception
		}

}
	
	
public void sendComplexNotification(ComplexMail mail) throws MailException {

		
		MimeMessage message = javaMailSender.createMimeMessage();

		try {
			MimeMessageHelper helper = new MimeMessageHelper(message, true);

			String sub = mail.getSub();
			String body = "<html>" +
					"<head><title>"+"kk"+"</title></head>" +
					"<body>" +
					mail.getBody()+
					"<br>"+
					"Select any one option"
					+"<br>"	
					+ "<a href="+mail.getApproveApi()+"\"\r\n" + 
					"style=\"\r\n" + 
					"\r\n" + 
					"display: block;\r\n" + 
					"    width: 115px;\r\n" + 
					"    height: 25px;\r\n" + 
					"    background: #4CAF50;\r\n" + 
					"    padding: 10px;\r\n" + 
					"    text-align: center;\r\n" + 
					"    border-radius: 5px;\r\n" + 
					"    color: white;\r\n" + 
					"    font-weight: bold;\r\n" + 
					"    line-height: 25px;\r\n" + 
					"    text-decoration: none;\r\n" + 
					"\"\r\n" + 
					">Approve</a>"
				+"<br>"	
	+ "<a href=\""+mail.getRejectApi()+"\"\r\n" + 
	"style=\"\r\n" + 
	"\r\n" + 
	"display: block;\r\n" + 
	"    width: 115px;\r\n" + 
	"    height: 25px;\r\n" + 
	"    background: #f44336;\r\n" + 
	"    padding: 10px;\r\n" + 
	"    text-align: center;\r\n" + 
	"    border-radius: 5px;\r\n" + 
	"    color: white;\r\n" + 
	"    font-weight: bold;\r\n" + 
	"    line-height: 25px;\r\n" + 
	"    text-decoration: none;\r\n" + 
	"\"\r\n" + 
	">Reject</a>"+	"</body>" +	"</html>";
			
			
			
			helper.setFrom("mynameismakesh@gmail.com");
			helper.setTo(mail.getTo());
			helper.setSubject(sub);
			helper.setText(body,true);

			

		
		try {
			javaMailSender.send(message);
			System.out.println("\t Email sent successfully !");
		}
		
		catch (Exception e) {

			System.out.println("!!!   Error in Sending Mail   !!!");
			System.out.println("This may due to invalid email id or password");
			System.out.println("---------xxxxxxx---------");
			System.out.println();
		}
		
	}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}

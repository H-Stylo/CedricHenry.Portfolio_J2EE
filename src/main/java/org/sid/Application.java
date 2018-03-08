package org.sid;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.sid.dao.ContactRepository;
import org.sid.entities.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {
	
	@Autowired
	private ContactRepository contactRepository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		/**
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		contactRepository.save(new Contact("Stylo", "Bic", df.parse("25/01/1990"), "StyloBic@gmail.com", "0625142514", "Stylo.jpg" ));
		contactRepository.save(new Contact("Stabylo", "Lapin", df.parse("30/03/2013"), "StabyloLapin@gmail.com", "0355879688", "Stabylo.jpg" ));
		contactRepository.findAll().forEach(c->{
			System.out.println(c.getNom());
		});
		*/
	}
}

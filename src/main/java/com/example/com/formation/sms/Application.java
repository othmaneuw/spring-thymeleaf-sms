package com.example.com.formation.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.com.formation.sms.entity.Student;
import com.example.com.formation.sms.repository.StudentRepository;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private StudentRepository studentRepository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		Student student = new Student("Othmane","EL KHEMMAR","oth@gmail.com");
		studentRepository.save(student);
		
	}

}

package com.tka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@ComponentScan("com") // If u give proper packagename then it is not allowed
@EntityScan("com")
@SpringBootApplication
@EnableAspectJAutoProxy
public class SecondSpringProject177Application {

	public static void main(String[] args) {
		System.out.println("Welcome");
		SpringApplication.run(SecondSpringProject177Application.class, args);
		System.out.println("thanks");

	}

}

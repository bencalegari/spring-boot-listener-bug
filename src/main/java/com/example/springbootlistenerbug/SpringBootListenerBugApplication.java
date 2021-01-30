package com.example.springbootlistenerbug;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan

public class SpringBootListenerBugApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootListenerBugApplication.class, args);
	}

}

package com.example.awscicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootCicdDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootCicdDemoApplication.class, args);
		System.out.println("Helllllooooo");
	}

	@GetMapping("/getData")
	public String getData() {
		return "Welcome to aws cicd process using aws codepipeline and codebuild";
	}

}

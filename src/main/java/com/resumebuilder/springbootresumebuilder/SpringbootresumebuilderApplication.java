package com.resumebuilder.springbootresumebuilder;

import com.resumebuilder.springbootresumebuilder.model.Employee;
import com.resumebuilder.springbootresumebuilder.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringbootresumebuilderApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootresumebuilderApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(SpringbootresumebuilderApplication.class);
	}

	@Bean
	public CommandLineRunner commandLineRunner(String[]args, EmployeeRepository employeeRepository) {
		return runner -> {
//			Employee razu = new Employee("Razu Ahamed", "01762700100", "razu@gmail.com", "Magura");
//			Employee sazu = new Employee("sazu Ahamed", "01762700101", "sazu@gmail.com", "Jessore");
//			employeeRepository.save(razu);
//			employeeRepository.save(sazu);
		};
	}
}

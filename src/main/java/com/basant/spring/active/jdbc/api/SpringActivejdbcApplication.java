package com.basant.spring.active.jdbc.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class SpringActivejdbcApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringActivejdbcApplication.class, args);

		/*Base.open("com.mysql.jdbc.Driver", "jdbc:mysql://localhost:3306/test", "root", "cisco");
		SpringActivejdbcApplication app = new SpringActivejdbcApplication();
		app.create(878, "x", "y");*/

	}

	/*public void create(int id, String firstName, String lastName) {
		System.out.println("execution started...");
		Person e = new Person();
		e.set("id", id);
		e.set("first_name", firstName);
		e.set("last_name", lastName);
		e.insert();
		System.out.println("execution ended...");
	}*/
}

package com.crud.crudApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
	1. We hit API GET Request to ProductController
	2. Controller then go to ProductService to Get the data
	3. (Not Happening Here) Services go to ProductRepository to do DB Call
	4. Entity verify the table structure
 */



@SpringBootApplication
public class CrudAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudAppApplication.class, args);
	}

}

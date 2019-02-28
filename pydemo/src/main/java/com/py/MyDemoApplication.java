package com.py;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@RestController
@EnableSwagger2
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class, DataSourceTransactionManagerAutoConfiguration.class })
public class MyDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyDemoApplication.class, args);
	}
	
	@GetMapping("/hello")
	public String hello() {
		return "hello spring security";
	}

}

package com.example.ribboneurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// TODO : this is a eureka server (annotation)
public class RibbonEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RibbonEurekaServerApplication.class, args);
	}
}

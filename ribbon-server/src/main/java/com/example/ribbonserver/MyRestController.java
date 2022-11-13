package com.example.ribbonserver;

import org.springframework.web.bind.annotation.GetMapping;

// TODO : this is a Rest Controller
public class MyRestController {

	// TODO : auto-inject Environment

	@GetMapping("/")
	public String health() {
		return "I am Ok";
	}

	@GetMapping("/backend")
	public String backend() {
		System.out.println("Inside MyRestController::backend...");

		// TODO : call a backend server with right port
		// TODO : show message from backend with server port
		return null;
	}
}

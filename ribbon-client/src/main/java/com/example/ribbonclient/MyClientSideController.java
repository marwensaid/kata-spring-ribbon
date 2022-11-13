package com.example.ribbonclient;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

// TODO this is a REST controller
public class MyClientSideController {
	// TODO create a rest template bean and make it load balanced
	// TODO auto-inject it

	@RequestMapping("/client/frontend")
	public String hi(@PathVariable String id) {
		// TODO we gonna return a random String using our REST object
		return null;
	}
}

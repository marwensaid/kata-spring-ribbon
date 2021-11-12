package com.example.ribbonclient;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

// this is a REST controller
public class MyClientSideController {
	// create a rest template bean and make it load balanced


	// auto-inject it

	@RequestMapping("/client/frontend")
	public String hi(@PathVariable String id) {
		// we gonna return a randomString using our rest object
		return null;
	}
}

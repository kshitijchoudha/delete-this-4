package com.example.springboothelm;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	@RequestMapping("/")
	public String greeting() {
		return "Greetings!! from delete-this-4";
	}

    @RequestMapping("/hello")
	public String greetings() {
		return "Hello!! from delete-this-4";
	}

}
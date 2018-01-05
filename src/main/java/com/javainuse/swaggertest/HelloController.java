package com.javainuse.swaggertest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping(method = RequestMethod.GET, value = "/api/javainuse")
	public String sayHello() {
		return "Swagger Hello World";}
	
		@RequestMapping(method = RequestMethod.GET, value = "/api/javainuse/1")
		public String saySpring() {
			return "Spring Hello World";}
	
			@RequestMapping(method = RequestMethod.GET, value = "/api/javainuse/2")
			public String saySpringBoot() {
				return "SpringBoot Hello World";
	
	
	}
}

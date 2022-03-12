package com.docker.step1.dockerhelloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/docker")
public class HelloDocker {

	@GetMapping("/hello")
	public String getHelloMessage() {
		
		return "hello umesh first docker is runnig...";
	}
	
}

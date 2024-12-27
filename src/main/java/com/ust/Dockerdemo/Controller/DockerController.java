package com.ust.Dockerdemo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {
	
	@GetMapping("/welcome")
	public String getName() {
		return "Docker is working fine";
		
	}
}

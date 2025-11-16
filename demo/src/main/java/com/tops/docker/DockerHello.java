package com.tops.docker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/docker")
public class DockerHello 
{
	@GetMapping
	public String getName()
	{
		return "Hello SpringBoot with Docker and Jenkins";
	}
}

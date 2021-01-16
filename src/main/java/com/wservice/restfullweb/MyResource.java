package com.wservice.restfullweb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyResource
{
	@Autowired
	public SomeClass someClass;

	//http://localhost:8080/restfullspringweb/sayhi
	@GetMapping(path = "/sayhi")
	public String getIt()
	{
		return "Hello " + someClass.getId() + " - " + someClass.getName();
	}
}

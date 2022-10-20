package com.spwosi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestCont {

	@GetMapping("/hello")
	public String getHello()
	{
		String str = "Hello friends, I am Sitaram Reddy";	
		return str;
	}
	
}

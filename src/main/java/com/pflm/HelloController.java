package com.pflm;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
  
	@RequestMapping("/hello.do")
	public String hello(HttpServletRequest request, HttpServletResponse response) {
		
		return "DDDD";
		
	}
	
	
}

package com.example.demo.controller;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RestTestController {
	
	@GetMapping("/restTest")
	//@ResponseBody
	public Object restTest() {
		String jsonData = "{\"name\":\"홍길동\"}";
		
		HashMap<String, String> data = new HashMap<String, String>(); 
		data.put("one", "first");
		data.put("two", "second");
		data.put("three", "third");
		return data;
	}
}

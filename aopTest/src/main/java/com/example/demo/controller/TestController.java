package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class TestController {
	@GetMapping("/aopTest")
	public String aopTest(HttpSession session) {
		System.out.println("-=-=> aopTest");
		System.out.println(session.getAttribute("message"));
		return "aopTest";
	}
}

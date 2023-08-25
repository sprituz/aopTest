package com.example.demo.util;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import jakarta.servlet.http.HttpSession;

@Component
@Aspect
public class MyAspect {
	//@Before(value ="execution(* com.example.demo.controller.TestController.*(..))")
	//@After(value ="execution(* com.example.demo.controller.TestController.*(..))")
	@Around(value ="execution(* com.example.demo.controller.TestController.*(..)) and args(session, ..)")
	public Object before(ProceedingJoinPoint point, HttpSession session) {
		System.out.println("-=-=-=> before...");
		System.out.println(" --- > " + point.getSignature());
		
		Object obj = null;
		
		try {
			session.setAttribute("message","Test Data");
			obj = point.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return obj;
	}
}

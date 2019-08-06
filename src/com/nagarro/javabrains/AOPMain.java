package com.nagarro.javabrains;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nagarro.javabrains.service.ShapeService;

public class AOPMain {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		ShapeService service=ctx.getBean("shapeService",ShapeService.class);
		System.out.println(service.getCircle().getName());
	}

}

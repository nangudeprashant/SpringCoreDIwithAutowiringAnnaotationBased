package com.javaLive.constructorBased;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.javaLive.config.AppConfiguration;

public class MainClass {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(AppConfiguration.class);
		context.refresh();
		Room room = (Room) context.getBean("room3");
		System.out.println(room);
		((AbstractApplicationContext) context).registerShutdownHook();
		;
	}
}

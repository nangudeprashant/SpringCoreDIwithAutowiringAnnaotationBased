package com.javaLive.byType;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.javaLive.config.AppConfiguration;

public class MainClass {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(AppConfiguration.class);
		context.refresh();
		Room room = (Room) context.getBean("room2");
		System.out.println(room);
		context.registerShutdownHook();
	}
}

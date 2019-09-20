package com.javaLive.byName;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.javaLive.config.AppConfiguration;

public class MainClass {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(AppConfiguration.class);
		context.refresh();
		Student studentA = (Student) context.getBean("student");
		Student studentB = (Student) context.getBean("student");
		System.out.println("Is student bean is singleton?  " + (studentA == studentB));
		((AbstractApplicationContext) context).registerShutdownHook();
		;
	}
}

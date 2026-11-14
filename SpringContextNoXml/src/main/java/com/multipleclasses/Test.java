package com.multipleclasses;

import java.io.ObjectInputFilter.Config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.Configs;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext continer= new AnnotationConfigApplicationContext(Configs.class);
		
		SimTest simTest = continer.getBean("simTest",SimTest.class);
		
		simTest.test();
		
	}
	

}

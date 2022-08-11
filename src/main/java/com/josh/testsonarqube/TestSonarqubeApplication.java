package com.josh.testsonarqube;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestSonarqubeApplication {

	public static void doTest(){
		System.out.println("This is thing");
		Object o = null;
		System.out.println(o.toString());
	}

	public static void doTest2(){
		System.out.println("This is thing");
		Object o = null;
		System.out.println(o.toString());
	}
	public static void main(String[] args) {
		SpringApplication.run(TestSonarqubeApplication.class, args);
	}

}

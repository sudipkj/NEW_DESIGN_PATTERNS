package com.designpatterns.designpattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.designpatterns.designpattern.contoller.eagerLoading.EargerLoadingSingleton;

@SpringBootApplication
public class DesignPatternApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesignPatternApplication.class, args);
		
	}

}

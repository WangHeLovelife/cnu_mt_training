package com.meituan.saas.catering_management;

import org.junit.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CateringManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(CateringManagementApplication.class, args);
	}

	@Test
	public void calculate() {
		System.out.println("hello,test");
	}
}

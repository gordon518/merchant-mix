package com.merchant.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.merchant.demo.dao")
public class MerchantApplication {

	public static void main(String[] args) {
		SpringApplication.run(MerchantApplication.class, args);
	}

}

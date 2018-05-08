package com.ebm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Lazy;

@SpringBootApplication
@ComponentScan(basePackages="com.ebm")
@EnableAutoConfiguration
@Lazy(false)
public class QueryreportApplication {

	public static void main(String[] args) {

		SpringApplication.run(QueryreportApplication.class, args);
	}
}

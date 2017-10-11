package com.shiny.disconf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ComponentScan(basePackages = {"com.shiny.disconf"})
@ImportResource({"classpath:disconf.xml"})
public class DisconfApplication {

	public static void main(String[] args) {
		SpringApplication.run(DisconfApplication.class, args);
	}
}

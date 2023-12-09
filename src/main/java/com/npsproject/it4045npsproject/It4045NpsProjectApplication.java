package com.npsproject.it4045npsproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class It4045NpsProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(It4045NpsProjectApplication.class, args);
	}

}

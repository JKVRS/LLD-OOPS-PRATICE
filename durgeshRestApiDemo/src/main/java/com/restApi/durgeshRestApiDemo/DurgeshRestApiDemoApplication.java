package com.restApi.durgeshRestApiDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.restApi.*")
@EnableJpaRepositories(basePackages = {"com.restApi.dao"})
@EntityScan(basePackages = {"com.restApi.durgeshRestApiDemoEntity"})
public class DurgeshRestApiDemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(DurgeshRestApiDemoApplication.class, args);

	}

}

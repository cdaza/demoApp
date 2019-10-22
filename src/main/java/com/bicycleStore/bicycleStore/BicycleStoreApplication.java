package com.bicycleStore.bicycleStore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication(exclude = ErrorMvcAutoConfiguration.class)
@EnableSwagger2
public class BicycleStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BicycleStoreApplication.class, args);
	}

}

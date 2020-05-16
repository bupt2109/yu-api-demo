package org.yu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"org.yu"})
public class YuDemoApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(YuDemoApiApplication.class, args);
	}

}

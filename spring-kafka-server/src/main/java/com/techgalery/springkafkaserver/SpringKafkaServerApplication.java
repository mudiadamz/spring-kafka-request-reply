package com.techgalery.springkafkaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class SpringKafkaServerApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringKafkaServerApplication.class, args);
	}
}

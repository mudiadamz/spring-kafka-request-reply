package com.techgalery.springkafkaclient;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@Slf4j
@SpringBootApplication
@EnableKafka
public class SpringKafkaClientApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringKafkaClientApplication.class, args);
	}

}

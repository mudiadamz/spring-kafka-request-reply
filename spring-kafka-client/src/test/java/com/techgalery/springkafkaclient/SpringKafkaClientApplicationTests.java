package com.techgalery.springkafkaclient;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@Slf4j
class SpringKafkaClientApplicationTests {
	@Autowired KafkaService kafkaService;

	@Test
	void kafkaRequestReply_test() throws Exception {
		String request = "abcd123";
		String mustResponse = "321dcba";
		Object sendReply = kafkaService.kafkaRequestReply(request);
		String responseString = String.valueOf(sendReply);
		assertEquals(mustResponse, responseString);
		log.info("Request message: {}, Response message: {}", request, responseString);
	}
}

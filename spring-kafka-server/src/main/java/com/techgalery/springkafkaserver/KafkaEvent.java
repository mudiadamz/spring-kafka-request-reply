package com.techgalery.springkafkaserver;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.Message;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

@Component
public class KafkaEvent {
    // KafkaListener echoes the correlation ID and determines the reply topic
    @KafkaListener(groupId="${myproject.consumer-group}", topics = "${myproject.send-topics}")
    @SendTo
    public Message<?> listen(ConsumerRecord<String, Object> consumerRecord) {
        String reversedString = new StringBuilder( String.valueOf(consumerRecord.value()) ).reverse().toString();
        return MessageBuilder.withPayload( reversedString )
                .build();
    }
}

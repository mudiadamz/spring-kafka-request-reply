# SPRING KAFKA SYNCHRONOUS SEND-REPLY
The spring-kafka-client service will send a string message to the server-project over Kafka, then the spring-kafka-service consumes the message and then reverse the string and produce it back to the client, based on the topic that the client is requesting. 

## How to run
- Start your docker daemon/service
- cd spring-kafka-request-reply
- Run kafka broker locally
```
docker-compose up -d 
```
- to stop zookeeper and kafka (later)
```
docker-compose rm -fsv
```
- Start our producer service on the spring-kafka-server
```
cd spring-kafka-server 
mvn spring-boot:run
```
- Let's run the spring-kafka-client, to produce and expect the right reply from the spring-kafka-server

```
cd spring-kafka-client 
mvn test
```

## Result Screenshots
- Run spring-kafka-server
  ![alt text](https://github.com/mudiadamz/spring-kafka-request-reply/blob/main/img/spring-kafka-server-run.jpg?raw=true)
- Run test output
  ![alt text](https://github.com/mudiadamz/spring-kafka-request-reply/blob/main/img/request-reply-test-output.jpg?raw=true)
- Kafka tool request topic
  ![alt text](https://github.com/mudiadamz/spring-kafka-request-reply/blob/main/img/kafka-tool-my-topic.jpg?raw=true)
- Kafka tool reply topic
  ![alt text](https://github.com/mudiadamz/spring-kafka-request-reply/blob/main/img/kafka-tool-my-topic-reply.jpg?raw=true)

## Blogs
This is a project example from this blog : [techgalery.com : Spring Kafka - how to use ReplyingKafkaTemplate send and reply synchronously](https://www.techgalery.com/2021/08/spring-kafka-how-to-use.html)

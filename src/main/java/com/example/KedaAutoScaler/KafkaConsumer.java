package com.example.KedaAutoScaler;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import org.springframework.messaging.handler.annotation.Payload;

@Slf4j
@RequiredArgsConstructor
@Component
public class KafkaConsumer {

    @KafkaListener(
            topics = "sample-topic",
            groupId = "<your_consumer_group>",
            containerFactory = "kafkaListenerContainerFactory")
    public void listen(@Payload String event) throws InterruptedException {
        log.info("Received message - event: " + event);

//        To slow down the processing and observe scaling of pods
//        Thread.sleep(10000);
    }
}
package com.example.kafkaconsumerspringboot.listener;

import com.example.model.People;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    /*
    @KafkaListener(topics = "test", groupId = "group_id")
    public void messageListener(String message) {
        System.out.println("Receiving message:" + message);
    }
*/
    @KafkaListener(topics = "test", groupId = "group_id", containerFactory = "peopleKafkaListenerContainerFactory")
    public void consumeJson(People people) {
        System.out.println("Consumed JSON Message:" + people);
    }
}

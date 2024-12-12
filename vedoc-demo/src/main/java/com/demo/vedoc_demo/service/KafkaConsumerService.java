package com.demo.vedoc_demo.service;

import com.demo.vedoc_demo.constants.AppConstants;
import com.demo.vedoc_demo.model.KafkaMessage;
import com.demo.vedoc_demo.repo.KafkaConsumerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class KafkaConsumerService {

    @Autowired
    private KafkaConsumerRepository kafkaMessageRepository;

    private List<KafkaMessage> messageBuffer = new ArrayList<>();

    @KafkaListener(topics = "frn-message", groupId = "group-1")
    public void consumeMessage(String message) {
        System.out.println("Message consumed: " + message);

        // Create a new KafkaMessage entity
        KafkaMessage kafkaMessage = new KafkaMessage();
        kafkaMessage.setMessage(message);
        kafkaMessage.setTopic("frn-message");

        // Save the message to the database
        kafkaMessageRepository.save(kafkaMessage);
        System.out.println("Message saved to DB: " + message);
    }

}
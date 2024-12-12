//package com.demo.vedoc_demo.config;
//
//import com.demo.vedoc_demo.constants.AppConstants;
//import org.apache.kafka.common.protocol.types.Field;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.kafka.annotation.KafkaListener;
//import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
//import org.springframework.kafka.core.ConsumerFactory;
//
//@Configuration
//public class KafkaConsumerConfig {
//
////    @KafkaListener(topics = AppConstants.TOPIC_NAME, groupId = AppConstants.GROUPID)
////    public void updatedMessage(String value){
////
////        System.out.println(value);
////    }
//
//    @Bean
//    public ConcurrentKafkaListenerContainerFactory<String, String> kafkaListenerContainerFactory(ConsumerFactory<String, String> consumerFactory) {
//        ConcurrentKafkaListenerContainerFactory<String, String> factory = new ConcurrentKafkaListenerContainerFactory<>();
//        factory.setConsumerFactory(consumerFactory);
//        return factory;
//    }
//}

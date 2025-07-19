package com.example.ordersproducer.producer;

import com.example.ordersproducer.config.KafkaOrderTopicProperties;
import com.example.ordersproducer.model.OrderRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderKafkaProducer {

    private final KafkaTemplate<String, OrderRequest> kafkaTemplate;
    private final KafkaOrderTopicProperties topicProperties;

    public String sendMessage(OrderRequest orderRequest) {
        kafkaTemplate.send(topicProperties.getTopic(), orderRequest);

        return "Petición enviada";
    }
}
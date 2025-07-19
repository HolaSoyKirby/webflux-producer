package com.example.ordersproducer.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaOrderTopicConfig {

    private final KafkaOrderTopicProperties kafkaOrderTopicProperties;

    public KafkaOrderTopicConfig(KafkaOrderTopicProperties kafkaOrderTopicProperties) {
        this.kafkaOrderTopicProperties = kafkaOrderTopicProperties;
    }

    @Bean
    public NewTopic ordersTopic() {
        return TopicBuilder.name(kafkaOrderTopicProperties.getTopic())
                .build();
    }
}
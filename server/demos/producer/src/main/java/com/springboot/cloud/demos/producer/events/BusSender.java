package com.springboot.cloud.demos.producer.events;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author Jump
 */
@Component
@Slf4j
public class BusSender {

    @Resource
    private RabbitTemplate rabbitTemplate;

    public void send(String routingKey, String message) {
        log.info("routingKey:{}=>message:{}", routingKey, message);
        rabbitTemplate.convertAndSend(routingKey, message);
    }
}

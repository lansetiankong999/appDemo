package com.springboot.cloud.gateway.admin.events;

import com.springboot.cloud.gateway.admin.config.BusConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

/**
 * @author Jump
 */
@Component
@Slf4j
public class EventSender {

    @Resource
    private RabbitTemplate rabbitTemplate;

    @Resource
    private MessageConverter messageConverter;

    @PostConstruct
    public void init() {
        rabbitTemplate.setMessageConverter(messageConverter);
    }

    public void send(String routingKey, Object object) {
        log.info("routingKey:{}=>message:{}", routingKey, object);
        rabbitTemplate.convertAndSend(BusConfig.EXCHANGE_NAME, routingKey, object);
    }
}

package br.edu.utfpr;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class NotificationConsumer {

    @RabbitListener(queues = {"${spring.rabbitmq.queue}"})
    public void receive(@Payload String fileBody) {
        System.out.println("Message " + fileBody);
    }

}

package br.com.appkafka.mensagemlinda;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "my-topic", groupId = "group-id")
    public void consume(String message){
        System.out.println("Mensagem recebida: " + message);
    }
}

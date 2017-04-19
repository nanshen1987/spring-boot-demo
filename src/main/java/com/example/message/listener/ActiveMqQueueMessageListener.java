package com.example.message.listener;


import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 * Created by sn on 2017-4-19.
 */
@Component
public class ActiveMqQueueMessageListener  {
    @JmsListener(destination = "testAmq")
    public void onMessage(Message message) {
        TextMessage tm = (TextMessage) message;
        try {
            System.out.println("消费消息"+tm.getText());
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}

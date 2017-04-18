package com.example.message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Queue;
import javax.jms.Session;

/**
 * Created by sn on 2017-4-16.
 */
@Component
public class ActiveMqUtil {
    private final JmsTemplate jmsTemplate;

    @Autowired
    public ActiveMqUtil(JmsTemplate jmsTemplate)
    {
        this.jmsTemplate=jmsTemplate;
    }

    public void sendMsg()
    {
        for (int i=0;i<100;i++)
        {
            jmsTemplate.send("testAmq",new MessageCreator() {
                @Override
                public Message createMessage(Session session) throws JMSException {
                    return session.createTextMessage("hello");
                }
            });
        }
    }
}

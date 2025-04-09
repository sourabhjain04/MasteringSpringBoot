package com.example.jms;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

@Service
public class JmsReceiver {

    @JmsListener(destination = "exampleQueue")
    public void receiveMessage(String message) {
        System.out.println("Received: " + message);
    }
}

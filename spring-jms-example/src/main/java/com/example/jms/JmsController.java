package com.example.jms;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/jms")
public class JmsController {

    private final JmsSender jmsSender;

    public JmsController(JmsSender jmsSender) {
        this.jmsSender = jmsSender;
    }

    @PostMapping("/send")
    public String sendMessage(@RequestParam String message) {
        jmsSender.sendMessage(message);
        return "Message sent: " + message;
    }
}

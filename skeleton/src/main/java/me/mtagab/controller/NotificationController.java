package me.mtagab.controller;

import me.mtagab.model.Sample;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.handler.annotation.MessageExceptionHandler;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.messaging.simp.annotation.SendToUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.annotation.Resource;


@Controller
@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
public class NotificationController {

    private static final Logger logger = LoggerFactory.getLogger(NotificationController.class);

    @Resource
    private SimpMessagingTemplate messagingTemplate;

    @MessageMapping("/broadcast")
    @SendTo("/topic/all")
    public Sample writeMessage(@Payload String message) {
        //messagingTemplate.convertAndSend("/topic/all", sample);
        logger.info("Client sent WS message " + message);
        Sample sample = new Sample("Hi!");
        return sample;
    }

    @MessageExceptionHandler
    @SendToUser("/queue/errors")
    public String handleException(Throwable exception) {
        return exception.getMessage();
    }
}

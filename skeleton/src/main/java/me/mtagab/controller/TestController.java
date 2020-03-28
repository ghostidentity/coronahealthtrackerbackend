package me.mtagab.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Date;

@RestController
public class TestController {

    @Autowired
    private RestTemplate restTemplate;

    private static final Logger logger = LoggerFactory.getLogger(TestController.class);

    @GetMapping("demo")
    ResponseEntity<String> customHeader() {
        logger.info("called");
        return ResponseEntity.ok()
                .header("Custom-Header", "foo")
                .body("Custom header set");
    }

    @GetMapping("hello")
    public String hello() {
        return "Hello, the time at the server is now " + new Date() + "\n";
    }

}

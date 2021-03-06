package me.mtagab.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

@Controller
public class IndexController {

    @Autowired
    private RestTemplate restTemplate;

    private static final Logger logger = LoggerFactory.getLogger(IndexController.class);

    @RequestMapping(value = "/api/test", method = RequestMethod.GET)
    public ResponseEntity<String> HomeController() {
        logger.info("test..");
        return ResponseEntity.ok().build();
    }

    @GetMapping("/api/demo")
    public ResponseEntity<String> customHeader() {
        logger.info("called");
        return ResponseEntity.ok()
                .header("Custom-Header", "foo")
                .body("Custom header set");
    }


}

package me.mtagab.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/main")
    ResponseEntity<String> customHeader() {
        return ResponseEntity.ok()
                .header("Custom-Header", "foo")
                .body("Custom header set");
    }
}

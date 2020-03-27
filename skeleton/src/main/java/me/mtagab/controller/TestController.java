package me.mtagab.controller;

import me.mtagab.dto.Foo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {


    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/main")
    ResponseEntity<String> customHeader() {

       // Foo foo = restTemplate.getForEntity("http://localhost:9000/resource/foos/1", Foo.class).getBody();

        return ResponseEntity.ok()
                .header("Custom-Header", "foo")
                .body("Custom header set");
    }

}

package me.mtagab.service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/status")
public class GovernmentData {

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> login() {
        return ResponseEntity.ok("{'government' : 'running'}");
    }
}

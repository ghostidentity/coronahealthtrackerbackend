package me.mtagab.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class OathController {

    @RequestMapping(name = "/api/auth", method = RequestMethod.GET)
    public ResponseEntity<String>  redirection1() {
        return new ResponseEntity<>("Received response from auth server1", HttpStatus.ACCEPTED);
    }

    @RequestMapping(name = "/api/auth", method = RequestMethod.POST)
    public ResponseEntity<String>  redirection2() {
        return new ResponseEntity<>("Received response from auth server2", HttpStatus.ACCEPTED);
    }
}

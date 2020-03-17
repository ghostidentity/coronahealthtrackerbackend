package me.mtagab.service;

import me.mtagab.model.Credential;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/login")
public class Login {

    @Value("${database.connection}")
    String dbUrl;

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> login(@RequestBody Credential[] items) {
        return ResponseEntity.ok().build();
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> login() {
        return ResponseEntity.ok("{'service' : 'security'}");
    }
}

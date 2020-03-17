package me.mtagab.controller;

import me.mtagab.repository.AdmissionRequestRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdmissionRequestController {

    private static final Logger LOGGER = LoggerFactory.getLogger(AdmissionRequestController.class);

    @Autowired
    AdmissionRequestRepository repository;

    @RequestMapping(value = "/government/request", method = RequestMethod.GET)
    public Iterable findAll() {
        return repository.findAll();
    }
}

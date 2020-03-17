package me.mtagab.controller;

import me.mtagab.repository.VaccineStatusRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VaccineStatusController {

    private static final Logger LOGGER = LoggerFactory.getLogger(VaccineStatusController.class);

    @Autowired
    VaccineStatusRepository repository;

    @RequestMapping(value = "/government/vaccine", method = RequestMethod.GET)
    public Iterable findAll() {
        return repository.findAll();
    }
}

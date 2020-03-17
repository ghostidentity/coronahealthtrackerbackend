package me.mtagab.controller;

import me.mtagab.repository.HospitalRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SuppliesController {

    private static final Logger LOGGER = LoggerFactory.getLogger(SuppliesController.class);

    @Autowired
    HospitalRepository repository;

    @RequestMapping(value = "/hospital/supplies", method = RequestMethod.GET)
    public Iterable findAll() {
        return repository.findAll();
    }
}

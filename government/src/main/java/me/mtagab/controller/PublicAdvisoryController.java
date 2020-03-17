package me.mtagab.controller;

import me.mtagab.repository.PublicAdvisoryRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PublicAdvisoryController {

    private static final Logger LOGGER = LoggerFactory.getLogger(PublicAdvisoryController.class);

    @Autowired
    PublicAdvisoryRepository repository;

    @RequestMapping(value = "/government/publicadvisory", method = RequestMethod.GET)
    public Iterable findAll() {
        return repository.findAll();
    }
}

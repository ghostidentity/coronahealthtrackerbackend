package me.mtagab.controller;

import me.mtagab.repository.CodeAlertRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CodeAlertController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CodeAlertController.class);

    @Autowired
    CodeAlertRepository repository;

    @RequestMapping(value = "/government/codealert", method = RequestMethod.GET)
    public Iterable findAll() {
        return repository.findAll();
    }
}

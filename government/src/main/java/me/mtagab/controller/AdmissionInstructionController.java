package me.mtagab.controller;

import me.mtagab.repository.AdmissionInstructionRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdmissionInstructionController {

    private static final Logger LOGGER = LoggerFactory.getLogger(AdmissionInstructionController.class);

    @Autowired
    AdmissionInstructionRepository repository;

    @RequestMapping(value = "/government/instruction", method = RequestMethod.GET)
    public Iterable findAll() {
        return repository.findAll();
    }
}

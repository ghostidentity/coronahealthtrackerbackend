package me.mtagab.controller;

import me.mtagab.repository.TravelLocalAlertRepository;
import me.mtagab.repository.TravelNationalAlertRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TravelAlertController {

    private static final Logger LOGGER = LoggerFactory.getLogger(TravelAlertController.class);

    @Autowired
    TravelLocalAlertRepository local_repository;

    @Autowired
    TravelNationalAlertRepository national_repository;

    @RequestMapping(value = "/government/travelalert", method = RequestMethod.GET)
    public Iterable findAll() {
        return local_repository.findAll();
    }
}

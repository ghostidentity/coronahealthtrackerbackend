package me.mtagab.controller;

import lombok.extern.slf4j.Slf4j;
import me.mtagab.entity.JournalEntity;
import me.mtagab.repository.HealthRepository;
import me.mtagab.repository.JournalRepository;
import me.mtagab.repository.TravelRepository;
import me.mtagab.service.GovernmentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@Slf4j
@RestController
public class PersonController {

    private static final Logger logger = LoggerFactory.getLogger(PersonController.class);

    @Resource
    private JournalRepository journalRepository;

    @Resource
    private HealthRepository healthRepository;

    @Resource
    private TravelRepository travelRepository;

    @Resource
    private GovernmentService governmentService;


    @RequestMapping(value = "/admission", method = RequestMethod.POST)
    public String requestAdmission() {
        return governmentService.requestAdmission();
    }

    @GetMapping("/")
    public Iterable<JournalEntity> getJournal() {
        logger.info("Index");
        return journalRepository.findAll();
    }

    @GetMapping("/health/{userid}")
    public String  getHealth(@PathVariable("userid") Long userid) {
        logger.info("Checking health of " + userid);
        return "Health Data ...";
    }
}

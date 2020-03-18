package me.mtagab.controller;

import lombok.extern.slf4j.Slf4j;
import me.mtagab.PersonConfig;
import me.mtagab.entity.JournalEntity;
import me.mtagab.repository.HealthRepository;
import me.mtagab.repository.JournalRepository;
import me.mtagab.repository.TravelRepository;
import me.mtagab.service.GovernmentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

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

    @Resource
    private DiscoveryClient discoveryClient;

    @Resource
    private PersonConfig config;

    @RequestMapping(value = "/admission", method = RequestMethod.GET)
    public ResponseEntity<String>  requestAdmission() {
        logger.info("Test: " + governmentService.requestAdmission());
        return new ResponseEntity<>(governmentService.requestAdmission(), HttpStatus.OK);
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

    @GetMapping
    public String load() {
        RestTemplate restTemplate = new RestTemplate();
        String resourceUrl = "http://government:8080";
        ResponseEntity<String> response = restTemplate.getForEntity(resourceUrl, String.class);

        StringBuilder serviceList = new StringBuilder();
        if (discoveryClient != null) {
            List<String> services = this.discoveryClient.getServices();
            for (String service : services) {
                List<ServiceInstance> instances = this.discoveryClient.getInstances(service);
                serviceList.append("[").append(service).append(" : ").append((!CollectionUtils.isEmpty(instances)) ? instances.size() : 0).append(" instances ]");
            }
        }
        return String.format(config.getMessage(), response.getBody(), serviceList.toString());
    }
}

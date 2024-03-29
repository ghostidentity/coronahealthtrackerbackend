package me.mtagab.controller;

import lombok.extern.slf4j.Slf4j;
import me.mtagab.AccountConfig;
import me.mtagab.repository.GovernmentRepository;
import me.mtagab.repository.PhotoRepository;
import me.mtagab.repository.UsersRepository;
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
public class AccountController {

    private static final Logger logger = LoggerFactory.getLogger(AccountController.class);

    @Resource
    private GovernmentRepository governmentRepository;

    @Resource
    private PhotoRepository photoRepository;

    @Resource
    private UsersRepository usersRepository;

    @Resource
    private AccountConfig config;

    @Resource
    private RestTemplate restTemplate;

    @Resource
    private DiscoveryClient discoveryClient;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ResponseEntity<String> findAll() {
        String url = "http://person:8080/health/1";
        return restTemplate.getForEntity(url, String.class);
    }

    @GetMapping("/photo")
    public ResponseEntity<String> getPhotos() {
        logger.info("Photo Controller " + photoRepository.findAll());
        return new ResponseEntity<>("Photo Controller ", HttpStatus.OK);
    }

    @GetMapping("/government")
    public ResponseEntity<String> getGovernment() {
        logger.info("Government Controller " + governmentRepository.findAll());
        return new ResponseEntity<>("Government Controller", HttpStatus.OK);
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<String> getUser(@PathVariable("userId") Long userId) {
        logger.info("Received: " + userId);
        logger.info("User Controller " + usersRepository.findAll());
        return new ResponseEntity<>("User Controller", HttpStatus.OK);
    }

    @GetMapping("/services")
    public String getServices() {
        StringBuilder serviceList = new StringBuilder();
        if (discoveryClient != null) {
            List<String> services = this.discoveryClient.getServices();

            for (String service : services) {

                List<ServiceInstance> instances = this.discoveryClient.getInstances(service);

                serviceList.append("[").append(service).append(" : ").append((!CollectionUtils.isEmpty(instances)) ? instances.size() : 0).append(" instances ]");
            }
        }
        return serviceList.toString();
    }
}

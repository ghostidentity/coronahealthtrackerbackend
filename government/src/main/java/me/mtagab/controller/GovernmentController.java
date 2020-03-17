package me.mtagab.controller;

import lombok.extern.slf4j.Slf4j;
import me.mtagab.GovernmentConfig;
import me.mtagab.repository.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@Slf4j
@RestController
public class GovernmentController {

    private static final Logger logger = LoggerFactory.getLogger(GovernmentController.class);

    @Resource
    private AdmissionInstructionRepository admissionInstructionRepository;

    @Resource
    private AdmissionRequestRepository admissionRequestRepository;

    @Resource
    private CodeAlertRepository codeAlertRepository;

    @Resource
    private PublicAdvisoryRepository publicAdvisoryRepository;

    @Resource
    private TravelLocalAlertRepository travelLocalAlertRepository;

    @Resource
    private TravelNationalAlertRepository travelNationalAlertRepository;

    @Resource
    private VaccineStatusRepository vaccineStatusRepository;

    @Resource
    private GovernmentConfig config;

    @Resource
    private RestTemplate restTemplate;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ResponseEntity<String> showService() {
        return new ResponseEntity<>(config.getService(), HttpStatus.OK);
    }

    @RequestMapping(value = "/admission_request", method = RequestMethod.POST)
    public ResponseEntity<String> requestAdmission() {
        return new ResponseEntity<>(config.getIssue(), HttpStatus.NOT_IMPLEMENTED);
    }

    @RequestMapping(value = "/admission_request", method = RequestMethod.POST)
    public ResponseEntity<String> getAdmissionStatus() {
        return new ResponseEntity<>(config.getIssue(), HttpStatus.NOT_IMPLEMENTED);
    }

    @RequestMapping(value = "/admission_instruction", method = RequestMethod.GET)
    public ResponseEntity<String> getAdmissionInstruction() {
        return new ResponseEntity<>(config.getIssue(), HttpStatus.NOT_IMPLEMENTED);
    }

    @RequestMapping(value = "/admission_instruction", method = RequestMethod.POST)
    public ResponseEntity<String> setAdmissionInstruction() {
        return new ResponseEntity<>(config.getIssue(), HttpStatus.NOT_IMPLEMENTED);
    }

    @RequestMapping(value = "/public_advisory", method = RequestMethod.GET)
    public ResponseEntity<String> getPublicAdvisory() {
        return new ResponseEntity<>(config.getIssue(), HttpStatus.NOT_IMPLEMENTED);
    }

    @RequestMapping(value = "/public_advisory", method = RequestMethod.POST)
    public ResponseEntity<String> setPublicAdvisory() {
        return new ResponseEntity<>(config.getIssue(), HttpStatus.NOT_IMPLEMENTED);
    }

    @RequestMapping(value = "/travel_local", method = RequestMethod.GET)
    public ResponseEntity<String> getLocalAlert() {
        return new ResponseEntity<>(config.getIssue(), HttpStatus.NOT_IMPLEMENTED);
    }

    @RequestMapping(value = "/travel_local", method = RequestMethod.POST)
    public ResponseEntity<String> setLocalAlert() {
        return new ResponseEntity<>(config.getIssue(), HttpStatus.NOT_IMPLEMENTED);
    }

    @RequestMapping(value = "/travel_national", method = RequestMethod.GET)
    public ResponseEntity<String> getNationalAlert() {
        return new ResponseEntity<>(config.getIssue(), HttpStatus.NOT_IMPLEMENTED);
    }

    @RequestMapping(value = "/travel_national", method = RequestMethod.POST)
    public ResponseEntity<String> setNationalAlert() {
        return new ResponseEntity<>(config.getIssue(), HttpStatus.NOT_IMPLEMENTED);
    }

}

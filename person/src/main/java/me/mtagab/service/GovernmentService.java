package me.mtagab.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GovernmentService {

    private final RestTemplate restTemplate;

    public GovernmentService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @HystrixCommand(fallbackMethod = "getFallbackName", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1000") })
    public String requestAdmission() {
        return this.restTemplate.getForObject("http://government:8080/admission_request", String.class);
    }

    private String getFallbackName() {
        return "Fallback";
    }
}

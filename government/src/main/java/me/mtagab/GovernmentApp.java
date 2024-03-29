package me.mtagab;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableDiscoveryClient
@SpringBootApplication
public class GovernmentApp implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(GovernmentApp.class);

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(GovernmentApp.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("Government Service has been Started");
    }
}

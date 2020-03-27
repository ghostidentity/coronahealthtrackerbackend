package me.mtagab;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SkeletonApplication {

    private static final Logger logger = LoggerFactory.getLogger(SkeletonApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SkeletonApplication.class, args);
    }

}

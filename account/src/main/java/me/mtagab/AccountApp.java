package me.mtagab;

import lombok.extern.slf4j.Slf4j;
import me.mtagab.controller.AccountController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.client.RestTemplate;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Slf4j
@EnableScheduling
@SpringBootApplication
@EnableDiscoveryClient
@EnableSwagger2
public class AccountApp implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(AccountApp.class, args);
    }

    private static final Logger logger = LoggerFactory.getLogger(AccountController.class);

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    public Docket swaggerApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                    .apis(RequestHandlerSelectors.basePackage("me.mtagab.controller.AccountController"))
                    .paths(PathSelectors.any())
                .build()
                .apiInfo(new ApiInfoBuilder().version("1.0").title("Account API").description("Documentation Account API v1.0").build());
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("Account Service has been Started");
    }
}

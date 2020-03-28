package me.mtagab;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "welcome")
public class AccountConfig {
    private String message = "Account Service";
}

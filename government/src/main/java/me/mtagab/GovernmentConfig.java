package me.mtagab;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "welcome")
public class GovernmentConfig {
    private String service = "Government Service";
    private String issue = "The method you are trying to call is not yet implemented";
}

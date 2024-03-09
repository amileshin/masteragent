package com.teaching.masteragent.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Data
@Configuration
@ConfigurationProperties(prefix = "masteragent")
@PropertySource(value = "classpath:application.properties")
public class NodeConfig {
    private String masterUrl;
    private String localUrl;
}

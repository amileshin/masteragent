package com.teaching.masteragent.config;


import com.teaching.masteragent.util.yaml.YamlPropertiesSourceFactory;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Data
@Configuration
@ConfigurationProperties(prefix = "node")
@PropertySource(value = "classpath:NodeProperties.yaml", factory = YamlPropertiesSourceFactory.class)
public class NodeConfig {
    private String masterUrl;
}

package com.example.mybatis.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by xuexuxu on 2020-03-13
 */
@Component
@ConfigurationProperties(prefix = "consumer")
public class ConsumerConfig {

    private String enabledServiceDiscovery;

    public String getEnabledServiceDiscovery() {
        return enabledServiceDiscovery;
    }

    public void setEnabledServiceDiscovery(String enabledServiceDiscovery) {
        this.enabledServiceDiscovery = enabledServiceDiscovery;
    }
}

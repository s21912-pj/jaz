package com.jaz.pjatk.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "data.app")
public class CustomData {

    private boolean featureStatus;

    public boolean isFeatureStatus() {
        return featureStatus;
    }

    public void setFeatureStatus(boolean featureStatus) {
        this.featureStatus = featureStatus;
    }
}

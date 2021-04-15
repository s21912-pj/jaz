package com.jaz.pjatk.component.configuration;


import com.jaz.pjatk.model.ServiceObject;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
@ConditionalOnProperty(name="data.app.feature-status",havingValue = "true")
public class BeanHandler {

    private final static Logger log = LoggerFactory.getLogger(BeanHandler.class);

    @Bean
    public ServiceObject createBean(){
        log.info("feature is enabled!");
        return new ServiceObject();
    }
}

package com.jaz.pjatk.component.configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnExpression("${prop.status.value-feature:false}")
public class AdditionalBeanHandler {

    private final static Logger log = LoggerFactory.getLogger(AdditionalBeanHandler.class);

    @Bean
    public void testBean(){
        log.info("Hello from AdditionalBeanHandler class");
    }

}

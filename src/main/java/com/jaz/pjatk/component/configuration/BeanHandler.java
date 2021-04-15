package com.jaz.pjatk.component.configuration;


import com.jaz.pjatk.model.ServiceObject;


import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
@ConditionalOnProperty(name="data.app.feature-status",havingValue = "true")
public class BeanHandler {


    @Bean
    public ServiceObject createBean(){
        System.out.println("feature is enabled!");
        return new ServiceObject();
    }
}

package com.flows;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.flows.persistence.WorkflowTemplate;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
public class AppConfig {

    @Bean
    public ObjectMapper getObjectMapper() {
        return new ObjectMapper();
    }

    @Bean
    public WorkflowTemplate getWorkflowTemplate() {
        return new WorkflowTemplate();
    }
}

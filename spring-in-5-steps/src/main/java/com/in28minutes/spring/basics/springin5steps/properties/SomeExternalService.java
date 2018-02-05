package com.in28minutes.spring.basics.springin5steps.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SomeExternalService {

    @Value("${external.service.url}")
    private String url; // we want this to be different in diff environments

    public String returnServiceURL() {
        return url;
    }

}

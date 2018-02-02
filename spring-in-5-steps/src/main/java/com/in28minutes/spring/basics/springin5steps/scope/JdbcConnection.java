package com.in28minutes.spring.basics.springin5steps.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class JdbcConnection {

    @Autowired
    public JdbcConnection() {
        System.out.println("JDBC Connection");
    }

}

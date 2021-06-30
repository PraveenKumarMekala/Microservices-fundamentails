package com.example.restapi;

import com.example.configuration.PropertyConfiguration;
import com.example.domain.MyPojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    private PropertyConfiguration config;

    @GetMapping("/loadValues")
    public MyPojo loadAllValues() {
        return new MyPojo(config.getValue1(), config.getValue2());

    }
}

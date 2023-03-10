package com.ausmine;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@RestController
public class SpringRestController {

    @GetMapping("/connect")
    public String connect(){
        System.out.println("Spring Boot Application Connected.");
        return "Spring Boot Application Connected.";
    }

}
package org.example.spring_study.controller;

import org.example.spring_study.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleApiController {

    @Autowired
    @Qualifier(value = "englishGreetingService")
    private GreetingService greetingService;

    @GetMapping("/greeting/{name}")
    public String greeting(@PathVariable(name = "name") String name) {
        return greetingService.sayHello(name);
    }
}

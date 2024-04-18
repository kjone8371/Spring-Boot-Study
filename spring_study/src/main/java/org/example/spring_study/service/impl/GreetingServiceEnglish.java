package org.example.spring_study.service.impl;


import org.example.spring_study.service.GreetingService;
import org.springframework.stereotype.Service;

@Service(value = "englishGreetingService")
public class GreetingServiceEnglish implements GreetingService {

    @Override
    public String sayHello(String name) {
        return "Hello Mr. or Mz. " + name;
    }

    @Override
    public String sayGoodbye() {
        return "Good bye";
    }
}

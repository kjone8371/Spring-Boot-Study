package org.example.spring_study.service.impl;

import org.example.spring_study.service.GreetingService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service(value = "koreanGreetingService")
@Primary
public class GreetingServiceKorean implements GreetingService {

    @Override
    public String sayHello(String name) {
        return "안녕하세요 " + name + "씨";
    }

    @Override
    public String sayGoodbye() {
        return "안녕히 가세요.";
    }
}

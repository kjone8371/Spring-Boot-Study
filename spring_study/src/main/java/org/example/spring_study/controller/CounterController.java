package org.example.spring_study.controller;


import org.example.spring_study.service.CounterService;
import org.example.spring_study.service.impl.counter.CounterBean1;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/counter")
//@RequiredArgsConstructor
public class CounterController {

    private final CounterService counterService;

    public CounterController(CounterService counterService) {
        this.counterService = counterService;
    }

    @Autowired
    private ObjectProvider<CounterBean1> provider;

    //private CounterBean1 counterBean;

    @GetMapping("/increase")
    public int addCount() {
        CounterBean1 bean = provider.getObject();
        return bean.increase();
    }

}

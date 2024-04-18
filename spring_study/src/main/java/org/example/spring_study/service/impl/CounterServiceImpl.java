package org.example.spring_study.service.impl;


import org.example.spring_study.service.CounterService;
import org.example.spring_study.service.impl.counter.CounterBean;
import org.springframework.stereotype.Service;

@Service
public class CounterServiceImpl implements CounterService {

    private final CounterBean counterBean;

    public CounterServiceImpl(CounterBean counterBean) {
        this.counterBean = counterBean;
    }

    @Override
    public int increase() {
        return counterBean.increase();
    }
}

package com.kjone.testspring.service;


import com.kjone.testspring.domain.user.SignRequest;
import com.kjone.testspring.domain.user.SignResponse;

public interface SignService {

    public SignResponse login(SignRequest request) throws Exception;

    public boolean register(SignRequest request) throws Exception;

    public SignResponse getMember(String account) throws Exception;


}

package com.kjone.test.controller;

import com.kjone.test.domain.user.User;
import com.kjone.test.service.EmailService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/v1/mail")
@RequiredArgsConstructor
public class MailController {

    private final EmailService emailService;

    @PostMapping("/emailConfirm")
    public String mailConfirm(@RequestBody User user) {
        int num = emailService.sendEmail(user.getId());

        return "코드 발급" + num;
    }

    @PostMapping("/test")
    public ResponseEntity sendMail(@RequestBody User user){
        emailService.sendEmail(user.getId());
        return ResponseEntity.ok().build();
    }
}

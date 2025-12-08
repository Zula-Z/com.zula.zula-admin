package com.zula.admin.service;

import com.zula.admin.messages.publisher.command.UserLoginPublisher;
import com.zula.auth.messages.command.UserLogin;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class AdminService {

    private final UserLoginPublisher userLoginPublisher;

    public void publishUserLogin(UserLogin userLogin) {
        log.info("Dispatching UserLogin command for {}", userLogin.getUsername());
        userLoginPublisher.publish(userLogin);
    }
}

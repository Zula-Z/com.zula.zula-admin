package com.zula.admin.messages.publisher.command;

import com.zula.auth.messages.command.UserLogin;
import com.zula.queue.core.CommandPublisher;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserLoginPublisher {

    private final CommandPublisher commandPublisher;

    public void publish(UserLogin userLogin) {
        log.info("Publishing UserLogin command for {}", userLogin.getUsername());
        commandPublisher.sendCommand(userLogin);
    }
}

package com.zula.admin.controller;

import com.zula.admin.service.AdminService;
import com.zula.auth.messages.command.UserLogin;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/admin")
@RequiredArgsConstructor
public class AdminController {

    private final AdminService adminService;

    @GetMapping("/health")
    public String health() {
        return "dY`` Zula Admin Service is healthy! dYY›";
    }

    @PostMapping("/user-login")
    public ResponseEntity<Void> publishUserLogin(@RequestBody UserLogin userLogin) {
        adminService.publishUserLogin(userLogin);
        return ResponseEntity.accepted().build();
    }
}

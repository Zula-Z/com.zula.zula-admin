package com.zula.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ZulaAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZulaAdminApplication.class, args);
        System.out.println("Zula Admin Service Started!");
        System.out.println("REST API: http://localhost:8082");
        System.out.println("Ready to send requests to auth service.");
        System.out.println("Listening for auth responses...");
    }
}

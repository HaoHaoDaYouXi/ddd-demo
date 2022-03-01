package com.java.ddd.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * @author lenovo
 */
@RestController
@RequestMapping("/health")
public class HealthController {
    /**
     * 项目名称
     */
    @Value("${spring.application.name:job}")
    private String applicationName;


    @GetMapping("/open/check")
    public String healthCheck() {
        return String.format(applicationName+" is health! %s", LocalDateTime.now().toString());
    }

}

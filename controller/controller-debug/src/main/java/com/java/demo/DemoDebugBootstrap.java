package com.java.demo;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * DemoDebugBootstrap
 * @author TONE
 * @date 2022/3/1
 */
@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
@MapperScan(basePackages = {"com.java.demo.mapper"})
@ComponentScan(basePackages = {"com.java.demo"})
@Slf4j
public class DemoDebugBootstrap {
    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(DemoDebugBootstrap.class, args);
    }
}

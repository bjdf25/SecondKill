package com.debug.kill.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(value = {"classpath:spring/spring-jdbc.xml"})
@MapperScan(basePackages = "com.debug.kill.model.mapper")
public class MainApplicaition extends SpringBootServletInitializer{
    public static void main(String[] args) {
        SpringApplication.run(MainApplicaition.class,args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(MainApplicaition.class);
    }
}

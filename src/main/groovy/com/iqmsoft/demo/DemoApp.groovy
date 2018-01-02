package com.iqmsoft.demo

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.builder.SpringApplicationBuilder
import org.springframework.boot.web.support.SpringBootServletInitializer

@SpringBootApplication
class DemoApp extends SpringBootServletInitializer {

    static void main(String[] args) {
        SpringApplication.run DemoApp, args
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(DemoApp.class);
    }
}

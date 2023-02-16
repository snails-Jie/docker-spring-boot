package com.docker.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class DemoController {

    @RequestMapping("/home")
    public String home() {
        log.info("Hello Docker World");
        return "Hello Docker World";
    }
}

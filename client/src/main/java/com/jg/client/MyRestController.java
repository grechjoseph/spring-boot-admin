package com.jg.client;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class MyRestController {

    @GetMapping("/test")
    public String getTest() {
        return "Hello World!";
    }

}
package com.skh;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/")
    public String test(){
        return "Welcome to Spring Demo project.";
    }
}

package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/suraj")
    public String sayHello() {
        return "Hello from Spring Boottttttt  - this is 16.171.139.36";
    }
}

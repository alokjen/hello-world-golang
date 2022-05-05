package com.example.helloworld;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class HelloWorldController {

    @GetMapping("/greeting")
    public String hello(@RequestParam(value="name", defaultValue="world") String name) {
        return "hello "+name;
    }
}
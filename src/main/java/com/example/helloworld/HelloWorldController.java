package com.example.helloworld;

import com.example.model.Greeting;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicInteger;

@RestController
public class HelloWorldController {

    private final AtomicInteger atom = new AtomicInteger();
    public static final String format = "Hello %s";

    @GetMapping("/greeting")
    public Greeting hello(@RequestParam(value="name", defaultValue="world") String name) {

        return new Greeting(atom.incrementAndGet(), String.format(format, name));
    }
}
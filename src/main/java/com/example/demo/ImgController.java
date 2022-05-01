package com.example.demo;

import java.util.concurrent.atomic.AtomicLong;
    
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ImgController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/gallery")
    public ImgPack imgPack(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new ImgPack(counter.incrementAndGet(), String.format(template, name));
    }
}
    


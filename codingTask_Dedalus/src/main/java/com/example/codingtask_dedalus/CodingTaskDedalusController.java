package com.example.codingtask_dedalus;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CodingTaskDedalusController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }
}

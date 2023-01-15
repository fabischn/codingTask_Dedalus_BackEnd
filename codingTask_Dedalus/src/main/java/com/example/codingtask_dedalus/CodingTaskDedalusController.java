package com.example.codingtask_dedalus;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class CodingTaskDedalusController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }

    @GetMapping("/analyzeVovels/{text}")
    public HashMap<String, Integer> analyzeVovels(@PathVariable("text") String text) {
        return new TextAnalyzer().analyzeVovels(text);
    }

    @GetMapping("/analyzeConsonants/{text}")
    public HashMap<String, Integer> analyzeConsonants(@PathVariable("text") String text) {
        return new TextAnalyzer().analyzeConsonants(text);
    }
}

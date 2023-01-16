package com.example.codingtask_dedalus;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class TextAnalyzerTest {

    private TextAnalyzer textAnalyzer;

    @BeforeAll
    public void setUp() {
        textAnalyzer = new TextAnalyzer();
    }

    @Test
    void analyzeVovels1() {
        String text = "";
        HashMap<String, Integer> expected = new HashMap<>();
        expected.put("A", 0);
        expected.put("E", 0);
        expected.put("I", 0);
        expected.put("O", 0);
        expected.put("U", 0);
        HashMap<String, Integer> actual = textAnalyzer.analyzeVovels(text);
        assertEquals(expected, actual);
    }

    @Test
    void analyzeVovels2() {
        String text = "Hello World!";
        HashMap<String, Integer> expected = new HashMap<>();
        expected.put("A", 0);
        expected.put("E", 1);
        expected.put("I", 0);
        expected.put("O", 2);
        expected.put("U", 0);
        HashMap<String, Integer> actual = textAnalyzer.analyzeVovels(text);
        assertEquals(expected, actual);
    }

    @Test
    void analyzeConsonants1() {
        String text = "";
        HashMap<String, Integer> expected = new HashMap<>();
        HashMap<String, Integer> actual = textAnalyzer.analyzeConsonants(text);
        assertEquals(expected, actual);
    }

    @Test
    void analyzeConsonants2() {
        String text = "Hello World!";
        HashMap<String, Integer> expected = new HashMap<>();
        expected.put("!", 1);
        expected.put("R", 1);
        expected.put("D", 1);
        expected.put("W", 1);
        expected.put("H", 1);
        expected.put("L", 3);
        HashMap<String, Integer> actual = textAnalyzer.analyzeConsonants(text);
        assertEquals(expected, actual);
    }
}
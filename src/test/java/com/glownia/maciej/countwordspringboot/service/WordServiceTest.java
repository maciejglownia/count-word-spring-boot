package com.glownia.maciej.countwordspringboot.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class WordServiceTest {

    @Autowired
    WordService wordService;

    @Test
    public void testCountWordMassachusetts() {
        // [[M, 1], [a, 2], [s, 4], [c, 1], [h, 1], [u, 1], [e, 1], [t, 2]]
        String word = "Massachusetts";
        List<List<String>> result = wordService.countNumbersOfLettersInWord(word);
        List<List<String>> expectedResult = List.of(
                List.of("M", "1"),
                List.of("a", "2"),
                List.of("s", "4"),
                List.of("c", "1"),
                List.of("h", "1"),
                List.of("u", "1"),
                List.of("e", "1"),
                List.of("t", "2"));
        assertEquals(expectedResult, result);
    }

    @Test
    public void testCountWordMunicipalities() {
        // [[m, 1], [u, 1], [n, 1], [i, 4], [c, 1], [p, 1], [a, 1], [l, 1], [t, 1], [e, 1], [s, 1]]
        String word = "municipalities";
        List<List<String>> result = wordService.countNumbersOfLettersInWord(word);
        List<List<String>> expectedResult = List.of(
                List.of("m", "1"),
                List.of("u", "1"),
                List.of("n", "1"),
                List.of("i", "4"),
                List.of("c", "1"),
                List.of("p", "1"),
                List.of("a", "1"),
                List.of("l", "1"),
                List.of("t", "1"),
                List.of("e", "1"),
                List.of("s", "1"));
        assertEquals(expectedResult, result);
    }


    @Test
    public void testCountWordCustomization() {
        // [[C, 1], [u, 1], [s, 1], [t, 2], [o, 2], [m, 1], [i, 2], [z, 1], [a, 1], [n, 1]]
        String word = "Customization";
        List<List<String>> result = wordService.countNumbersOfLettersInWord(word);
        List<List<String>> expectedResult = List.of(
                List.of("C", "1"),
                List.of("u", "1"),
                List.of("s", "1"),
                List.of("t", "2"),
                List.of("o", "2"),
                List.of("m", "1"),
                List.of("i", "2"),
                List.of("z", "1"),
                List.of("a", "1"),
                List.of("n", "1"));
        assertEquals(expectedResult, result);

    }
}
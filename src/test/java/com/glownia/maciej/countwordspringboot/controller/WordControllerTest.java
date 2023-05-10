package com.glownia.maciej.countwordspringboot.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class WordControllerTest {

    @Autowired
    WordController wordController;
    @Test
    public void testAllowedLettersInStringMassachusetts() {
        String word = "Massachusetts";
        boolean containsAllowedLetters
                = wordController.checkIfWordContainsAllowedCharacters(word);
        assertTrue(containsAllowedLetters);
    }

    @Test
    public void testNotAllowedLettersInStringMassachusetts() {
        String word = "Massachu888setts";
        boolean containsAlsoNotAllowedLetters =
                wordController.checkIfWordContainsAllowedCharacters(word);
        assertFalse(containsAlsoNotAllowedLetters);
    }
}
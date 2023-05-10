package com.glownia.maciej.countwordspringboot.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Handles logic to count letters in a given word.
 */
@Service
public class WordService {

    public List<List<String>> countNumbersOfLettersInWord(String word) {
        return createListOfListRepresentsCountedLettersOfWordInOrderOfTheirAppearance(word);
    }

    private List<List<String>> createListOfListRepresentsCountedLettersOfWordInOrderOfTheirAppearance(String word) {
        Map<Character, Integer> countedLetters =
                countLetters(word);

        List<List<String>> listOfList = new ArrayList<>();
        for (Character c : countedLetters.keySet()) {
            listOfList.add(List.of(c.toString(), String.valueOf(countedLetters.get(c))));
        }
        return listOfList;
    }

    private Map<Character, Integer> countLetters(String word) {
        return word.chars()
                .mapToObj(c -> (char) c)
                .collect(
                        Collectors.toMap(Function.identity(),
                                counter -> 1,
                                Integer::sum,
                                LinkedHashMap::new));
    }
}

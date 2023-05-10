package com.glownia.maciej.countwordspringboot.controller;

import com.glownia.maciej.countwordspringboot.model.CountedWordResponse;
import com.glownia.maciej.countwordspringboot.service.WordService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Map;

@RestController
public class WordController {

    private WordService wordService;

    // No need explicitly @Autowired -> DI through constructor
    public WordController(WordService wordService) {
        this.wordService = wordService;
    }

    @PostMapping("/count-word")
    public CountedWordResponse countNumbersOfLettersInWord(@RequestBody Map<String, String> countThis) {

        String word = countThis.get("countThis");
        if (!checkIfWordContainsAllowedCharacters(word)) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }

        List<List<String>> countedWord = wordService.countNumbersOfLettersInWord(word);

        return new CountedWordResponse(countedWord);
    }

    public boolean checkIfWordContainsAllowedCharacters(String word) {
        return word.matches("[a-zA-Z]*");
    }
}

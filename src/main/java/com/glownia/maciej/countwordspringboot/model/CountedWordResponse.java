package com.glownia.maciej.countwordspringboot.model;

import java.util.List;

/**
 * Represents response will be obtained after call POST method in Controller
 */
public class CountedWordResponse {

    private List<List<String>> countedWord;

    public CountedWordResponse(List<List<String>> countedWord) {
        this.countedWord = countedWord;
    }

    public List<List<String>> getCountedWord() {
        return countedWord;
    }

    public void setCountedWord(List<List<String>> countedWord) {
        this.countedWord = countedWord;
    }

    @Override
    public String toString() {
        return "WordResponse{" +
                "countedWord=" + countedWord +
                '}';
    }
}

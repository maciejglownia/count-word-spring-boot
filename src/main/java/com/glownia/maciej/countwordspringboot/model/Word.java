package com.glownia.maciej.countwordspringboot.model;

import java.util.Map;

/**
 * Represents a map contains a word which is passing in Request Body.
 * Value of the map contains a word needs to be handled by logic (count letters in a word).
 */
public class Word {

    private Map<String, String> countThis;

    public Word(Map<String, String> countThis) {
        this.countThis = countThis;
    }

    public Map<String, String> getCountThis() {
        return countThis;
    }

    public void setCountThis(Map<String, String> countThis) {
        this.countThis = countThis;
    }

    @Override
    public String toString() {
        return "Word{" +
                "countThis=" + countThis +
                '}';
    }
}

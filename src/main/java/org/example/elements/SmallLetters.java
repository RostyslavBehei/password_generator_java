package org.example.elements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SmallLetters {
    private ArrayList<Character> alphabet;

    public SmallLetters() {
        List<Character> tempList = Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z');
        alphabet = new ArrayList<>(tempList);
    }

    public ArrayList<Character> getSmallLetters() {
        return alphabet;
    }

}

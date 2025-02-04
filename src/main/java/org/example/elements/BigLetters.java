package org.example.elements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BigLetters {
    private ArrayList<Character> bigLetters;
    public BigLetters() {
        List<Character> tempList = Arrays.asList('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z');
        this.bigLetters = new ArrayList<>(tempList);
    }

    public ArrayList<Character> getBigLetters() {
        return bigLetters;
    }
}

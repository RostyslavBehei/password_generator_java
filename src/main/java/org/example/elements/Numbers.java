package org.example.elements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Numbers {
    private ArrayList<Character> numbers;
    public Numbers() {
        List<Character> tempList = Arrays.asList('1','2', '3', '4', '5', '6', '7', '8', '9', '0');
        numbers = new ArrayList<>(tempList);
    }

    public ArrayList<Character> getNumber() {
        return numbers;
    }
}

package org.example.elements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Symbols {
    private ArrayList<Character> symbols;
    public Symbols() {
        List<Character> tempList = Arrays.asList('~','`','!','@','#','$','%','^','&','*','(',')','_','-','+','=','{','[','\'','}',']','|','\\',':',';','"','<',',','>','.','?','/');
        symbols = new ArrayList<>(tempList);
    }

    public List<Character> getSymbols() {
        return symbols;
    }
}

package org.example;

import org.example.elements.BigLetters;
import org.example.elements.SmallLetters;
import org.example.elements.Numbers;
import org.example.elements.Symbols;

import java.util.Random;

public class Generator {
    private String fileName;
    private int length;
    public Generator(String fileName, int length) {
        this.fileName = fileName;
        this.length = length;
    }

    public String generatePassword() {
        SmallLetters smallLetters = new SmallLetters();
        BigLetters bigLetters = new BigLetters();
        Numbers numbers = new Numbers();
        Symbols symbols = new Symbols();

        Random random = new Random();

        String[] split = fileName.split(",");
        StringBuilder stringBuilder = new StringBuilder();

        for (String s : split) {
            switch (s) {
                case "1":
                    for (char smallLetter : smallLetters.getSmallLetters()) {
                        stringBuilder.append(smallLetter);
                    }
                    break;
                case "2":
                    for (char bigLetter : bigLetters.getBigLetters()) {
                        stringBuilder.append(bigLetter);
                    }
                    break;
                case "3":
                    for (char number : numbers.getNumber()) {
                        stringBuilder.append(number);
                    }
                    break;
                case "4":
                    for (char symbol : symbols.getSymbols()) {
                        stringBuilder.append(symbol);
                    }
                    break;
                default:
                    System.out.println("Invalid choice: " + s.trim());
                    return "0";
            }
        }

        StringBuilder password = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(stringBuilder.length());
            password.append(stringBuilder.charAt(randomIndex));
        }

        return password.toString();
    }
}

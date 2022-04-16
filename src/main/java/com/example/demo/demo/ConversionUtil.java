package com.example.demo.demo;

import java.util.HashMap;

public class ConversionUtil {

    private HashMap<Character, Integer> provideRomanCharacters(){
        HashMap<Character, Integer> romanCharacters = new HashMap<>();
        romanCharacters.put('I',1);
        romanCharacters.put('V',5);
        romanCharacters.put('X',10);
        return romanCharacters;
    }

    public int convertRomanNumerialsToNumber(String romanNumerial) {
        int resultSum = 0;
        int previousCharcterValue = Integer.MAX_VALUE;
        HashMap<Character, Integer> romanCharacters = provideRomanCharacters();

        for(int i=0; i<romanNumerial.length(); i++) {
            if(previousCharcterValue < romanCharacters.get(romanNumerial.charAt(i))){
                resultSum -= previousCharcterValue;
                resultSum += romanCharacters.get(romanNumerial.charAt(i)) - previousCharcterValue;
            } else {
                resultSum += romanCharacters.get(romanNumerial.charAt(i));
            }
            previousCharcterValue = romanCharacters.get(romanNumerial.charAt(i));
        }

        return resultSum;
    }
}

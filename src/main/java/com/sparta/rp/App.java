package com.sparta.rp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ArrayList<String> beatles = new ArrayList<>(Arrays.asList(
                "John",
                "Paul",
                "George",
                "Ringo"
        ));

         List<String> names = beatles.stream()
                .filter(name ->name.contains("o"))//intermediate operation
                .map(String::toUpperCase)
                //.forEach(System.out::println);//terminal operation
                .toList();
         String sentence = "The quick brown fox jumps over the lazy dog";
        System.out.println(containsAllAlphabet(sentence));



    }
    private static boolean containsAllAlphabet(String sentence){
        return sentence
                .toLowerCase()
                .chars()
                .filter(letter -> letter >= 'a' && letter <= 'z' )
                .distinct()
                .sorted()
                .peek(System.out::println)
                .count() == 26;
    }
}

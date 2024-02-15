package com.learnJava.strings;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

// This exercise is to test your understanding of Java Strings. A sample String declaration:

// String myString = "Hello World!"
// The elements of a String are called characters. The number of characters in a String is called the length, and it can be retrieved with the String.length() method.

// Given two strings of lowercase English letters,  and , perform the following operations:

// Sum the lengths of  and .
// Determine if  is lexicographically larger than  (i.e.: does  come before  in the dictionary?).
// Capitalize the first letter in  and  and print them on a single line, separated by a space.
// Input Format

// The first line contains a string . The second line contains another string . The strings are comprised of only lowercase English letters.

// Output Format

// There are three lines of output:
// For the first line, sum the lengths of  and .
// For the second line, write Yes if  is lexicographically greater than  otherwise print No instead.
// For the third line, capitalize the first letter in both  and  and print them on a single line, separated by a space.

public class SolutionOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        List<String> phrases = Arrays.asList(A, B);

        List<Integer> lengthInput = phrases.stream()
                .map(String::length)
                .collect(Collectors.toList());

        int sumLength = lengthInput.get(0) + lengthInput.get(1);
        System.out.println(sumLength);

        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        }

        System.out.println("No");
        String capitalizedA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String capitalizedB = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(capitalizedA + " " + capitalizedB);
    }
}

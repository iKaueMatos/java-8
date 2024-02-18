package com.learnJava.solution;

public class SolutionOne {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            for (int j = 1; j < 3; j++) {
                if (i % j == 0) {
                    continue;
                } else {
                    System.out.println("i = " + i + ", j =" + j);
                }
            }
        }
    }
}

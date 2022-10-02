package com.demoqa.utils;

public class NumberChecker {

    public static String checkNumber(int input) {
        if (input > 0) {
            return "POSITIVE";
        } else if (input < 0) {
            return "NEGATIVE";
        } else {
            return "ZERO";
        }
    }
}

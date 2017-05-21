package com.devix.company;

public class Main {

    public static void main(String[] args) {

        String value = "cat";

        for (int i = 0; i < value.length(); i++) {
            char c = value.charAt(i);
            System.out.println(c);
        }
    }
}

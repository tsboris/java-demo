package com.mavendemo;

import com.github.ricksbrown.cowsay.Cowsay;

public class App
{
    public static void main(String[] args) {
        int result = Calculator.add(4, 5);
        String[] cowArgs = new String[] { String.valueOf(result) };
        String cowString = Cowsay.say(cowArgs);

        System.out.printf(cowString);
    }
}
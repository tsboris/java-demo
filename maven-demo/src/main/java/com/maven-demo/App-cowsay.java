package com.mavendemo;

import com.github.ricksbrown.cowsay.Cowsay;
import com.github.ricksbrown.cowsay.plugin.CowExecutor;

public class App
{
    public static void main(String[] args) {
        // String message = "Develeap's Maven & Artifactory Demo!"
        String[] cowArgs = new String[]{"Develeap's Maven & Artifactory Demo!"};
        String result = Cowsay.say(cowArgs);

        System.out.println(result);
    }
}
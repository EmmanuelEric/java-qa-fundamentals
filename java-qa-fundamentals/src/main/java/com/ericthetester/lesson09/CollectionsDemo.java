package com.ericthetester.lesson09;

import java.util.ArrayList;

public class CollectionsDemo {
    public static void main(String[] args) {

        // ArrayList
        ArrayList<String> browsers = new ArrayList<>();
        // Then
        browsers.add("Chrome");
        browsers.add("Firefox");
        browsers.add("Edge");
        browsers.add("Safari");
        System.out.println(browsers);

        // Getting elements
        browsers.get(0);
        System.out.println(browsers.get(0));

        // Changing elements
        browsers.set(1, "opera");
        System.out.println(browsers.set(1, "opera"));

        // Removing elements
        browsers.remove("opera"); // or browsers.remove(1);
        System.out.println(browsers.remove("opera"));

        // Size
        System.out.println(browsers.size());

        // Checking whether something exists
        if (browsers.contains("chrome")) {
            System.out.println("Chrome is supported");
        }

        // Looping through ArrayList
        for  (String browser : browsers) {
            System.out.println(browser);
        }

        // Generics
        // ArrayList<String> is using a generic type, it means this array should contain strings.
        ArrayList<String> names =  new ArrayList<>();
        names.add("Osas");
        names.add("Ella");
        names.add("Nuel");
        // do not add a number because it is an integer and not a string.

        ArrayList<Integer> scores = new ArrayList<>();
        ArrayList<Double> prices = new ArrayList<>();
        ArrayList<Boolean> results = new ArrayList<>();
    }
}

package com.ericthetester.lesson09.Collections;
import java.util.ArrayList;

public class CollectionsPractice {
    public static void main(String[] args) {
        ArrayList<String> browsers = new ArrayList<>();
        addBrowser(browsers, "Chrome");
        addBrowser(browsers, "Firefox");
        addBrowser(browsers, "Edge");
        addBrowser(browsers, "Safari");

        System.out.println("==== BROWSER MANAGER ====");
        displayBrowsers(browsers);
        System.out.println();

        System.out.println("Total browsers: " + getBrowsersCount(browsers));
        System.out.println();

        System.out.println("Chrome supported: " + findBrowser(browsers, "Chrome"));

        removeBrowser(browsers, "Safari");
        System.out.println();

        System.out.println("After removing Safari:");
        displayBrowsers(browsers);


    }

    // add browser
    public static void addBrowser(ArrayList<String> browsers, String browser) {
        browsers.add(browser);
    }

    // display browser
    public static void displayBrowsers(ArrayList<String> browsers) {
        for (String browser : browsers) {
            System.out.println(browser);
        }
    }

    // get browser count
    public static int getBrowsersCount(ArrayList<String> browsers){
        return browsers.size();
    }

    // find browser
    public static boolean findBrowser(ArrayList<String> browsers, String browser) {
        return browsers.contains(browser);
    }

    // remove browser
    public static void removeBrowser(ArrayList<String> browsers, String browser) {
        browsers.remove(browser);
    }

    /*Create collection:
    ArrayList<String> browsers = new ArrayList<>();

    Then:
    Add an element
    browsers.add("Chrome");

    Remove an element
    browsers.remove("Safari");

    Check whether an element exists
    browsers.contains("Chrome");

    To know how many element are currently inside
    browsers.size();
    List<String> browsers = new ArrayList<>(); or
    ArrayList<String> browsers = new ArrayList<>(); both work.

    List<String> is an interface while
    ArrayList<String> is an implementation*/

}

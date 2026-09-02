package com.ericthetester.lesson09;
// Test Data Manager
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/*
=====HashSet=====

ArrayList<String> users = new ArrayList<>();

users.add("Eric");
users.add("John");
users.add("Eric");
users.add("Sarah");
...You get Eric, John, Eric, Sarah. There's a duplicate

HashSet<String> users = new HashSet<>();

users.add("Eric");
users.add("John");
users.add("Eric");
users.add("Sarah");
This gets rid of the duplicates. The result is Eric, John, Sarah.
A set doesn't allow duplicate element.

ArrayList<String> browsers = new ArrayList<>();
browsers.add("Chrome");
browsers.add("Chrome");
Becomes:
HashSet<String> browsers = new HashSet<>();
browsers.add("Chrome");
browsers.add("Chrome"); Results become just 1 chrome.

=====HashMap=====
A HashMap stores key-> value

HashMap<String, String> user = new HashMap<>();
user.put("Name", "Eric");
user.put("Role", "QA Engineer");
user.put("Location", "Lagos");
user.put("Status", "Active");

System.out.println(user.get("Name"));
Result is: Eric

put()
Add or update:
user.put("Role", "Automation Engineer"); note that if role already exist, then its value is replaced.

get()
Retrieve a value:
user.get("Role");

containsKey()
Check whether a key exists:
user.containsKey("Status");  value is true or false.

remove()
Remove a key/value pair:
user.remove("Location");
*/

public class CollectionsPractice2 {

    public static void main(String[] args) {

        // ArrayList
        ArrayList<String> testUsers = new ArrayList<>();

        testUsers.add("Eric");
        testUsers.add("John");
        testUsers.add("Sarah");
        testUsers.add("Eric");

        System.out.println("===== TEST USERS =====");

        for (String user : testUsers) {
            System.out.println(user);
        }

        // HashSet
        HashSet<String> uniqueUsers = new HashSet<>(testUsers);

        System.out.println();
        System.out.println("===== UNIQUE USERS =====");

        for (String user : uniqueUsers) {
            System.out.println(user);
        }

        // HashMap
        HashMap<String, String> userData = new HashMap<>();

        userData.put("Name", "Eric");
        userData.put("Role", "QA Automation Engineer");
        userData.put("Location", "Lagos");
        userData.put("Status", "Active");

        System.out.println();
        System.out.println("===== USER DATA =====");

        System.out.println("Name: " + userData.get("Name"));
        System.out.println("Role: " + userData.get("Role"));
        System.out.println("Location: " + userData.get("Location"));
        System.out.println("Status: " + userData.get("Status"));

        /* Map + looping
        user.get("Name");
        user.get("Role");
        user.get("Location");
        We can loop through the entire map.
        for (String key : user.keySet()) {
        System.out.println(key + ": " + user.get(key));
        }
        output would be:
        Name: Eric
        Role: QA Automation Engineer
        Location: Lagos
        Status: Inactive

        List<String> buttons = new ArrayList<>();

        buttons.add("Login");
        buttons.add("Register");
        buttons.add("Forget Password");
        To validate, you can code:
        if (buttons.contains("Login")) {
        system.out.println("Login button exists");
        }

        */
    }
}

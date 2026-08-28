package com.ericthetester.lesson08;

import java.util.Arrays;

public class StringDemo {
    public static void main(String[] args) {
        String name = "Eric";
        String role = "QA Automation Engineer";
        String company = "EIRIKR Technologies";
        System.out.println(name + " - " + role);

        // String length
        System.out.println(name.length());

        // Accessing characters
        char firstCharacter = name.charAt(0);
        System.out.println(firstCharacter);

        // Converting to uppercase
        System.out.println(name.toUpperCase());

        // Converting to lowercase
        System.out.println(name.toLowerCase());

        // Comparing strings
        if (name.equals("Eric")) {
            System.out.println("Match");
        }

        // Case-insensitive comparison
        String actual = "SUCCESS";
        if (actual.equalsIgnoreCase("success")) {
            System.out.println("Test passed");
        }

        // Checking whether a string contains something
        String message = "Login successful";
        System.out.println(message.contains("successful"));
        // Example
        String response = "User created successfully";
        if (response.contains("successfully")) {
            System.out.println("Test passed");
        }

        // startsWith() and endsWith()
        String url = "https://www.Eric.com/login";
        url.startsWith("https");
        url.endsWith("/login");
        System.out.println("URL: " + url);

        // Removing whitespace
        String username = "    Eric    ";
        String cleaned = username.trim();
        System.out.println("Username: " + cleaned);

        // Replacing characters
        String report = "Hello Eric";
        String result = report.replace("Eric", "Smith");
        System.out.println(result);

        // Replacing character
        String phone = "091-2345-678";
        String change = phone.replace("-", "");
        System.out.println(change);

        // Extracting part of a string
        String FirstName = "Emmanuel";
        String output = FirstName.substring(0,4);
        System.out.println(output);
        // remember substring(start, end)

        // Finding a char on string
        String text = "JARVIS Automation";
        System.out.println(text.indexOf("Automation")); // it should return 7, that's where Automation begins

        // Splitting strings
        String data = "Eric,QA,Automation,Java";
        String[] values = data.split(",");
        System.out.println(Arrays.toString(values));

        // String builder. For when you are repeatedly modifying strings, stringBuilder is ofter more efficient.
        StringBuilder builder = new StringBuilder();
        builder.append("JARVIS");
        builder.append(" ");
        builder.append("Automation");
        System.out.println(builder);


       /* public class UserDataValidator {

            public static void main(String[] args) {

                String userData = "Eric|QA Automation Engineer|Lagos|Active";

                String[] data = extractData(userData);

                String name = data[0];
                String role = data[1];
                String location = data[2];
                String status = data[3];

                System.out.println("===== USER DATA =====");
                System.out.println("Name: " + name);
                System.out.println("Role: " + role);
                System.out.println("Location: " + location);
                System.out.println("Status: " + status);

                System.out.println();

                System.out.println("===== VALIDATION =====");
                System.out.println("Status is Active: " + validateStatus(status));
                System.out.println("Role contains QA: " + validateRole(role));
                System.out.println("Location is Lagos: " + validateLocation(location));
            }

            public static String[] extractData(String userData) {

                return userData.split("\\|");
            }

            public static boolean validateStatus(String status) {

                return status.equalsIgnoreCase("Active");
            }

            public static boolean validateRole(String role) {

                return role.contains("QA");
            }

            public static boolean validateLocation(String location) {

                return location.equalsIgnoreCase("Lagos");
            }
        }

*/


    }
}

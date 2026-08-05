package com.ericthetester.lesson04;

public class DecisionMakingDemo {
    public static void main(String[] args) {
     /*  Condition
     │
     ▼
        responseCode == 200
        │
        true
        │
        Execute this block*/

        int responseCode = 200;

        if (responseCode == 200) {
            System.out.println("Request Successful");
        }
       //if...else statement
        boolean loginSuccessful = false;

        if (loginSuccessful) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Login Failed");
        }
        //else...if statement
        int score = 82;

        if (score >= 90) {
            System.out.println("Grade A");
        }
        else if (score >= 80) {
            System.out.println("Grade B");
        }
        else if (score >= 70) {
            System.out.println("Grade C");
        }
        else {
            System.out.println("Failed");
        }
        //nested...if statement
        boolean loggedIn = true;
        boolean isAdmin = false;

        if (loggedIn) {

            if (isAdmin) {
                System.out.println("Welcome Admin");
            } else {
                System.out.println("Welcome User");
            }

        }
        //switch statement
        String environment = "QA";

        switch (environment) {

            case "DEV":
                System.out.println("Development Environment");
                break;

            case "QA":
                System.out.println("Quality Assurance Environment");
                break;

            case "UAT":
                System.out.println("User Acceptance Testing");
                break;

            case "PROD":
                System.out.println("Production Environment");
                break;

            default:
                System.out.println("Unknown Environment");
        }
        // real QA automation example
        int apiResponseCode = 200;
        double responseTime = 1.20;

        if (responseCode == 200 && responseTime < 2.0) {

            System.out.println("API Test Passed");

        } else {

            System.out.println("API Test Failed");

        }
    }
}

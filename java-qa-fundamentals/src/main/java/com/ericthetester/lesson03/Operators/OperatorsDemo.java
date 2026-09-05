package com.ericthetester.lesson03.Operators;

public class OperatorsDemo {
    public static void main(String[] args) {
        int a = 20;
        int b = 5;
        System.out.println("Addition       : " + (a + b));
        System.out.println("Subtraction    : " + (a - b));
        System.out.println("Multiplication : " + (a * b));
        System.out.println("Division       : " + (a / b));
        System.out.println("Modulus        : " + (a % b));
        // modulus(%) is a type of operator that returns the remainder.
        //It is commonly used to determine if a number is even or odd.

        //assignment operators
        int score = 50;

        score += 10;
        System.out.println(score);

        score -= 5;
        System.out.println(score);

        score *= 2;
        System.out.println(score);

        score /= 5;
        System.out.println(score);

        //comparison operators
        int responseCode = 200;

        System.out.println(responseCode == 200);
        System.out.println(responseCode != 404);
        System.out.println(responseCode > 100);
        System.out.println(responseCode < 500);
        System.out.println(responseCode >= 200);
        System.out.println(responseCode <= 500);
        //output will be true or false.

        //logical operators. &&(AND), ||(OR), !(NOT)
        boolean loginSuccessful = true;
        boolean accountLocked = false;
        System.out.println(loginSuccessful && !accountLocked);
        System.out.println(loginSuccessful || accountLocked);
        System.out.println(!loginSuccessful);

        //Increment & Decrement
        int retryCount = 0;
        retryCount++;
        System.out.println(retryCount);
        retryCount--;
        System.out.println(retryCount);

        //Ternary operator
        /*if (testPassed) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }

         //The code below is called the ternary operator
        String result = testPassed ? "PASS" : "FAIL";

        System.out.println(result);*/

        // Testing the comparison and logical operators

        /*String username = "Eric";
        boolean loginSuccessful = true;
        int responseCode = 200;
        double responseTime = 1.35;

        boolean testPassed =
                loginSuccessful &&
                        responseCode == 200 &&
                        responseTime < 2.0;
        System.out.println("Test Passed: " + testPassed);*/

        String username = "Eric";

        double responseTime = 1.35;

        boolean testPassed =
                loginSuccessful &&
                        responseCode == 200 &&
                        responseTime < 2.0;

        String result = testPassed ? "PASS" : "FAIL";

        System.out.println("Username      : " + username);
        System.out.println("Response Time : " + responseTime);
        System.out.println("Test Passed   : " + testPassed);
        System.out.println("Result        : " + result);
    }
}

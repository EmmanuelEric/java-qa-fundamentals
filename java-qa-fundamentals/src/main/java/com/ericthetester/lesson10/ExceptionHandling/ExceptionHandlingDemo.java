package com.ericthetester.lesson10.ExceptionHandling;

public class ExceptionHandlingDemo {
    /*public static void main1(String[] args) {

        try {

            int result = 10 / 0;

            System.out.println(result);

        } catch (ArithmeticException e) {

            System.out.println("Cannot divide by zero.");

        }

        System.out.println("Program continues...");
    }*/

    // Multiple Exceptions

   /* public static void main2(String[] args) {
        try {

            String[] names = {"Eric", "John"};

            System.out.println(names[5]);

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Invalid array index.");

        }

    }*/

    // Finally.
    // The finally blocks runs whether an exception happens or not.

    /*public static void main3(String[] args) {

        try {

            int result = 10 / 2;

            System.out.println(result);

        } catch (ArithmeticException e) {

            System.out.println("Something went wrong.");

        } finally {

            System.out.println("Program execution completed.");

        }*/

    // Catching Multiple Exceptions

    /*public static void main(String[] args) {

        try {

            String[] names = {"Eric", "John"};

            int number = 10 / 0;

            System.out.println(names[5]);

        } catch (ArithmeticException e) {

            System.out.println("Arithmetic error occurred.");

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Invalid array index.");

        }*/

    // Mini Project: Login Validator

        public static void main(String[] args) {

            String username = "Eric";
            String password = "Jarvis123";

            try {

                validateUsername(username);
                validatePassword(password);

                System.out.println("Login validation successful.");

            } catch (Exception e) {

                System.out.println("Login validation failed: " + e.getMessage());

            } finally {

                System.out.println("Login process completed.");
            }
        }

        public static void validateUsername(String username) {

            if (username == null || username.isEmpty()) {
                // Throw simple means for the program to stop this operation and deliberately create an exception.

                throw new IllegalArgumentException(
                        "Username cannot be empty."
                );
            }
        }

        public static void validatePassword(String password) {

            if (password == null || password.length() < 6) {

                throw new IllegalArgumentException(
                        "Password must contain at least 6 characters."
                );
            }

    }


}

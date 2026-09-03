package com.ericthetester.lesson10.ExceptionHandling;

public class TestValidationException extends Exception {

    public TestValidationException(String message) {

        super(message);


        // this file "TestValidationException.java" is my own exception. This makes my automation code more descriptive.
        // This is an example of my own exception
        // extends Exception - Your class is now a type of Exception.
        // super(message); - passes your message to the parent EXCEPTION class.

    }
}
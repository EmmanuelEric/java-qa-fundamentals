package com.ericthetester.lesson16.polymorphism;

public class QaTest {

    protected String testName;

    public QaTest(String testName) {

        this.testName = testName;

    }

    public void run() {

        System.out.println(testName + " is running a generic test.");

    }
}

// This is the parent class. On its own, run() doesn't know anything
// about logins, APIs, or UI checks - it just gives every child class
// something to override.

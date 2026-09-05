package com.ericthetester.lesson11.oop;

public class Tester extends User {
// A child class  
    private String testingTool;

    public Tester(
            String name,
            String email,
            String testingTool
    ) {

        super(name, email);

        this.testingTool = testingTool;

    }

    public void runTest() {

        System.out.println(
                name + " is running a test using "
                        + testingTool
        );
    }
}

// From User, the Tester class gets access to:
// name, email, and the displayUserInfo() method.
// The Tester class also has its own unique property, testingTool, and a method runTest() that utilizes both inherited and unique properties.
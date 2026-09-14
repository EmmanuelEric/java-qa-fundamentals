package com.ericthetester.lesson16.polymorphism;

public class LoginTest extends QaTest {

    private String username;

    public LoginTest(
            String testName,
            String username
    ) {

        super(testName);

        this.username = username;

    }

    @Override
    public void run() {

        System.out.println(
                testName + " is verifying login for user: " + username
        );

    }
}

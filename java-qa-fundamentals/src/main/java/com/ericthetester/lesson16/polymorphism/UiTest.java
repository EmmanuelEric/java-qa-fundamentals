package com.ericthetester.lesson16.polymorphism;

public class UiTest extends QaTest {

    private String browser;

    public UiTest(
            String testName,
            String browser
    ) {

        super(testName);

        this.browser = browser;

    }

    @Override
    public void run() {

        System.out.println(
                testName + " is checking the UI on " + browser
        );

    }
}

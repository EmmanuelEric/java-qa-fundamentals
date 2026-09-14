package com.ericthetester.lesson17.abstraction;

public class SmokeTestSuite extends TestSuite {

    public SmokeTestSuite(String suiteName) {

        super(suiteName);

    }

    @Override
    public void execute() {

        System.out.println(suiteName + " is running critical smoke checks only.");

    }
}

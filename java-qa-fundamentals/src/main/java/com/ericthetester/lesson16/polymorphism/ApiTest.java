package com.ericthetester.lesson16.polymorphism;

public class ApiTest extends QaTest {

    private String endpoint;
    private int expectedResponseCode;

    public ApiTest(
            String testName,
            String endpoint,
            int expectedResponseCode
    ) {

        super(testName);

        this.endpoint = endpoint;
        this.expectedResponseCode = expectedResponseCode;

    }

    @Override
    public void run() {

        System.out.println(
                testName + " is calling " + endpoint
                        + " and expecting response code " + expectedResponseCode
        );

    }
}

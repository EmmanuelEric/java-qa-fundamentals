package com.ericthetester.lesson11.oop;

public class TestResultDemo {

    public static void main(String[] args) {

        TestResult result = new TestResult(
                "Login Test",
                "Passed",
                5
        );


        System.out.println(
                "Test Name: "
                        + result.getTestName()
        );

        System.out.println(
                "Status: "
                        + result.getStatus()
        );

        System.out.println(
                "Execution Time: "
                        + result.getExecutionTime()
                        + " seconds"
        );


        System.out.println();

        result.setStatus("Failed");

        result.setExecutionTime(10);


        System.out.println(
                "Updated Status: "
                        + result.getStatus()
        );

        System.out.println(
                "Updated Execution Time: "
                        + result.getExecutionTime()
                        + " seconds"
        );
    }
}
package com.ericthetester.lesson11.oop;

public class TestResult {

    private String testName;
    private String status;
    private int executionTime;


    public TestResult(
            String testName,
            String status,
            int executionTime
    ) {

        this.testName = testName;
        this.status = status;
        this.executionTime = executionTime;

    }


    public String getTestName() {

        return testName;

    }

    public String getStatus() {

        return status;

    }

    public int getExecutionTime() {

        return executionTime;

    }


    public void setStatus(String status) {

        if (
                status.equalsIgnoreCase("Passed")
                        ||
                status.equalsIgnoreCase("Failed")
                        ||
                status.equalsIgnoreCase("Skipped")
        ) {

            this.status = status;

        } else {

            System.out.println(
                    "Invalid status."
            );

        }
    }


    public void setExecutionTime(int executionTime) {

        if (executionTime >= 0) {

            this.executionTime = executionTime;

        } else {

            System.out.println(
                    "Execution time cannot be negative."
            );

        }
    }
}
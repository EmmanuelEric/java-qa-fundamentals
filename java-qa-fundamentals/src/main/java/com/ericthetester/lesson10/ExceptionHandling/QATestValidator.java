package com.ericthetester.lesson10.ExceptionHandling;

public class QATestValidator {

    public static void main(String[] args) {

        String actualStatus = "Passed"; // If changed to fail, it will output test failed: Status validation failed.
        String expectedStatus = "Passed";

        int actualResponseCode = 200; // If changed to 404, it will output test failed: Response code validation failed.
        int expectedResponseCode = 200;

        try {

            validateStatus(
                    actualStatus,
                    expectedStatus
            );

            validateResponseCode(
                    actualResponseCode,
                    expectedResponseCode
            );

            System.out.println(
                    "All test validations passed."
            );

        } catch (TestValidationException e) {

            System.out.println(
                    "TEST FAILED: " + e.getMessage()
            );

        } finally {

            System.out.println(
                    "Test execution completed."
            );
        }
    }


    public static void validateStatus(
            String actualStatus,
            String expectedStatus
    ) throws TestValidationException {

        if (!actualStatus.equalsIgnoreCase(expectedStatus)) {

            throw new TestValidationException(
                    "Status validation failed. Expected: "
                            + expectedStatus
                            + ", Actual: "
                            + actualStatus
            );
        }
    }


    public static void validateResponseCode(
            int actualResponseCode,
            int expectedResponseCode
    ) throws TestValidationException {

        if (actualResponseCode != expectedResponseCode) {

            throw new TestValidationException(
                    "Response code validation failed. Expected: "
                            + expectedResponseCode
                            + ", Actual: "
                            + actualResponseCode
            );
        }
    }
}
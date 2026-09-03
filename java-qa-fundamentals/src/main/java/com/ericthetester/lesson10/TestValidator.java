package com.ericthetester.lesson10;

public class TestValidator {

    public static void main(String[] args) {

        try {

            validateStatus("Failed");

            System.out.println("Test validation successful.");

        } catch (TestValidationException e) {

            System.out.println(
                    "Validation Error: " + e.getMessage()
            );

        }
    }

    public static void validateStatus(String status)
            throws TestValidationException {

        if (!status.equalsIgnoreCase("Passed")) {

            throw new TestValidationException(
                    "Expected status: Passed, but received: " + status
            );
        }
    }
}

// Custom Exceptions matter in QA because it makes the failures easier to understand and debug.
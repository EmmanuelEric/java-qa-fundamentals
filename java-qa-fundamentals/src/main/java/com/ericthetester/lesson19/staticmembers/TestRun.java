package com.ericthetester.lesson19.staticmembers;

public class TestRun {

    private static int totalTestsRun = 0;

    private String testName;
    private boolean passed;

    public TestRun(String testName, boolean passed) {

        this.testName = testName;
        this.passed = passed;

        totalTestsRun++;

    }

    public void printResult() {

        System.out.println(testName + ": " + (passed ? "PASSED" : "FAILED"));

    }

    public static int getTotalTestsRun() {

        return totalTestsRun;

    }
}

// totalTestsRun is static, so there is exactly one copy of it shared
// by every TestRun object, not one copy per instance like testName or
// passed. Each constructor call increments the same shared counter,
// which is why getTotalTestsRun() can report a total across every
// TestRun ever created - it belongs to the class itself, not to any
// single test run.

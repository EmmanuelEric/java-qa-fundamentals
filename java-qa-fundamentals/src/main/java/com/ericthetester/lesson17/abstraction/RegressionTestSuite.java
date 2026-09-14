package com.ericthetester.lesson17.abstraction;

public class RegressionTestSuite extends TestSuite {

    private int testCount;

    public RegressionTestSuite(String suiteName, int testCount) {

        super(suiteName);

        this.testCount = testCount;

    }

    @Override
    public void execute() {

        System.out.println(
                suiteName + " is running the full regression pack: " + testCount + " tests."
        );

    }
}

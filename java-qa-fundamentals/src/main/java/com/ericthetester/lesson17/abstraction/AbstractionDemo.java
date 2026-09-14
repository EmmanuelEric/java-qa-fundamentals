package com.ericthetester.lesson17.abstraction;

public class AbstractionDemo {

    public static void main(String[] args) {

        TestSuite[] suites = {
                new SmokeTestSuite("Smoke Suite"),
                new RegressionTestSuite("Regression Suite", 148)
        };

        for (TestSuite suite : suites) {

            suite.logStart();
            suite.execute();

            System.out.println();

        }
    }
}

// suites is declared as TestSuite[], the same dynamic-dispatch idea as
// lesson16's PolymorphismDemo. The difference: TestSuite itself could
// never appear in that array as a real object - "new TestSuite(...)"
// would not compile - only its concrete subclasses can. Abstraction
// forces the contract (execute()) while still sharing common behavior
// (logStart()) through ordinary inheritance.
//
// A note on super: every subclass constructor above calls
// super(suiteName) before doing anything else. That's not optional -
// Java requires the parent's constructor to run first so TestSuite can
// initialize suiteName before the subclass adds its own fields. The
// same rule applied back in lesson15's Tester and Admin constructors;
// it's just easy to miss until abstraction forces you to think about
// what the parent class actually is.

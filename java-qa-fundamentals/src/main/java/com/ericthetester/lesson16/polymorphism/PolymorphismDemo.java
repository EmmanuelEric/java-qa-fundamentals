package com.ericthetester.lesson16.polymorphism;

public class PolymorphismDemo {

    public static void main(String[] args) {

        QaTest[] regressionSuite = {
                new LoginTest("Login Test", "eric"),
                new ApiTest("Orders API Test", "/api/orders", 200),
                new UiTest("Checkout UI Test", "Chrome")
        };

        System.out.println("===== RUNNING REGRESSION SUITE =====");

        for (QaTest test : regressionSuite) {

            test.run();

        }
    }
}

// regressionSuite is declared as QaTest[], but each element is
// actually a LoginTest, ApiTest, or UiTest. At compile time Java only
// checks that QaTest has a run() method. At runtime, Java looks at
// each object's real type and calls that class's own run() -
// this is called dynamic method dispatch, and it's what lets one
// loop run three completely different kinds of tests through the
// same test.run() call.

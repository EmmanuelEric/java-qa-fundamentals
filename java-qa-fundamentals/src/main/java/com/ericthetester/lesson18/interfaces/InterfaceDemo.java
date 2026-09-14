package com.ericthetester.lesson18.interfaces;

public class InterfaceDemo {

    public static void main(String[] args) {

        Testable[] checks = {
                new ApiHealthCheck("Orders API Check", "/api/orders"),
                new DatabaseCheck("Primary DB Check", "orders_db")
        };

        for (Testable check : checks) {

            check.logStart("Health Check");
            check.execute();

            System.out.println();

        }

        ApiHealthCheck apiCheck = new ApiHealthCheck("Orders API Check", "/api/orders");

        apiCheck.execute();
        apiCheck.generateReport();
    }
}

// checks is declared as Testable[], the same dynamic-dispatch pattern
// used throughout lesson16 and lesson17 - except this time the shared
// type is an interface, not a class. DatabaseCheck and ApiHealthCheck
// share no common superclass beyond Object, only the Testable
// contract, and that's still enough for polymorphism to work.
//
// generateReport() only exists on ApiHealthCheck, not on Testable, so
// calling it needs the more specific ApiHealthCheck reference declared
// separately below the loop - the Testable[] array only knows about
// execute() and logStart().

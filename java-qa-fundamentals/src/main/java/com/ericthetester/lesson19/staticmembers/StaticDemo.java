package com.ericthetester.lesson19.staticmembers;

public class StaticDemo {

    public static void main(String[] args) {

        TestRun login = new TestRun("Login Test", true);
        TestRun checkout = new TestRun("Checkout Test", false);
        TestRun apiHealth = new TestRun("API Health Test", true);

        login.printResult();
        checkout.printResult();
        apiHealth.printResult();

        System.out.println("Total tests run: " + TestRun.getTotalTestsRun());

        System.out.println("Suite duration: " + TestUtils.formatDuration(4200));
    }
}

// TestRun.getTotalTestsRun() is called on the class, TestRun, not on
// login, checkout, or apiHealth - because it's static, calling it
// through an instance (like login.getTotalTestsRun()) would also
// compile, but it would be misleading: the value returned has nothing
// to do with login specifically, it's the same shared total no matter
// which instance (or no instance at all) you call it from.

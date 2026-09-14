package com.ericthetester.lesson21.finalkeyword;

public class BaseTest {

    protected String testName;

    public BaseTest(String testName) {

        this.testName = testName;

    }

    public final void setup() {

        System.out.println("Connecting to test environment for " + testName);

    }

    public void run() {

        System.out.println(testName + " is running the default test.");

    }
}

// setup() is final, so no subclass of BaseTest can override it -
// every test, regardless of what kind it is, connects to the
// environment the exact same way. run() has no such restriction,
// which is why SmokeTest below is free to override it.

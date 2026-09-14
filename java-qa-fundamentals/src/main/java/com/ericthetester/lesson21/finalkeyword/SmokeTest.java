package com.ericthetester.lesson21.finalkeyword;

public class SmokeTest extends BaseTest {

    public SmokeTest(String testName) {

        super(testName);

    }

    @Override
    public void run() {

        System.out.println(testName + " is running a quick smoke check.");

    }

    // setup() is inherited as-is from BaseTest and cannot be redeclared
    // here - a method named setup() with the same signature would fail
    // to compile in this class, since BaseTest already marked it final.
}

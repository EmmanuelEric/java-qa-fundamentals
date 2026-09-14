package com.ericthetester.lesson17.abstraction;

public abstract class TestSuite {

    protected String suiteName;

    public TestSuite(String suiteName) {

        this.suiteName = suiteName;

    }

    public void logStart() {

        System.out.println("Starting suite: " + suiteName);

    }

    public abstract void execute();
}

// TestSuite is abstract - it can never be instantiated directly with
// "new TestSuite(...)". It mixes a concrete method (logStart(), shared
// by every subclass) with an abstract method (execute(), which has no
// body here and forces each subclass to supply its own). This is the
// key difference from lesson16's QaTest: QaTest gave every child a
// default run() that was free to override, TestSuite gives no default
// at all and makes overriding execute() mandatory.

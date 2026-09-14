package com.ericthetester.lesson18.interfaces;

public interface Testable {

    void execute();

    default void logStart(String testName) {

        System.out.println("Starting test: " + testName);

    }
}

// An interface is a pure contract - it cannot hold instance fields or
// constructors, only method signatures (and, since Java 8, default
// methods with a body). execute() has no body here; every implementing
// class must supply one. logStart() does have a body, so implementing
// classes get it for free unless they choose to override it - this is
// how interfaces can share behavior without sharing state.

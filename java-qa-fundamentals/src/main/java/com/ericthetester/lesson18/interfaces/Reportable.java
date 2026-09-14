package com.ericthetester.lesson18.interfaces;

public interface Reportable {

    void generateReport();
}

// A second, unrelated contract. A class is only ever allowed to extend
// one other class, but it can implement as many interfaces as it needs
// - that's how ApiHealthCheck below can be both Testable and
// Reportable at the same time, something single inheritance alone
// could never do.

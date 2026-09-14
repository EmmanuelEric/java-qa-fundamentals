package com.ericthetester.lesson19.staticmembers;

public class TestUtils {

    public static String formatDuration(long milliseconds) {

        return (milliseconds / 1000.0) + "s";

    }
}

// TestUtils has no instance fields and is never instantiated with
// "new TestUtils()" anywhere in this lesson - it exists purely to
// group a static utility method. Calling TestUtils.formatDuration(...)
// works without ever creating a TestUtils object, which is the whole
// point of a static method: it belongs to the class, not to an
// instance of it.

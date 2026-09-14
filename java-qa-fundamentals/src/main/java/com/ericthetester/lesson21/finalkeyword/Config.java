package com.ericthetester.lesson21.finalkeyword;

public class Config {

    public static final int MAX_RETRIES = 3;

    private final String environment;

    public Config(String environment) {

        this.environment = environment;

    }

    public String getEnvironment() {

        return environment;

    }
}

// MAX_RETRIES is a compile-time constant - final on a static field
// that's assigned once, right here, and can never change again.
// environment is a different kind of final: it's blank when the field
// is declared and only gets assigned once, inside the constructor.
// Java enforces both the same way - try to reassign either one
// anywhere else and the code won't compile.

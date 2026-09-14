package com.ericthetester.lesson20.filehandling;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class TestResultLogger {

    private Path logFile;

    public TestResultLogger(Path logFile) {

        this.logFile = logFile;

    }

    public void logResult(String testName, boolean passed) throws IOException {

        String line = testName + ": " + (passed ? "PASSED" : "FAILED");

        try (BufferedWriter writer = Files.newBufferedWriter(
                logFile,
                StandardOpenOption.CREATE,
                StandardOpenOption.APPEND
        )) {

            writer.write(line);
            writer.newLine();

        }
    }
}

// try-with-resources guarantees writer.close() runs even if write()
// throws partway through - the same cleanup guarantee lesson10 relied
// on, just applied to a file handle instead of a custom exception.
// logResult() declares "throws IOException" instead of catching it,
// pushing the decision of how to handle a failed write onto whoever
// calls it - FileHandlingDemo is the one that actually decides.

package com.ericthetester.lesson20.filehandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileHandlingDemo {

    public static void main(String[] args) {

        Path logFile = Paths.get("target", "test-results.log");

        try {

            Files.createDirectories(logFile.getParent());

        } catch (IOException e) {

            System.out.println("Failed to prepare log directory: " + e.getMessage());

            return;

        }

        TestResultLogger logger = new TestResultLogger(logFile);

        try {

            logger.logResult("Login Test", true);
            logger.logResult("Checkout Test", false);
            logger.logResult("API Health Test", true);

        } catch (IOException e) {

            System.out.println("Failed to write test results: " + e.getMessage());

            return;

        }

        TestDataReader reader = new TestDataReader();

        try {

            List<String> results = reader.readLines(logFile);

            System.out.println("===== TEST RESULTS LOG =====");

            for (String line : results) {

                System.out.println(line);

            }

        } catch (IOException e) {

            System.out.println("Failed to read test results: " + e.getMessage());

        }
    }
}

// logFile points at target/test-results.log - target/ is already
// gitignored in this project, so running this demo repeatedly never
// leaves generated files for git to pick up. logResult() appends
// rather than overwrites, which is also why readLines() will print
// more than three lines if this demo has already been run before.

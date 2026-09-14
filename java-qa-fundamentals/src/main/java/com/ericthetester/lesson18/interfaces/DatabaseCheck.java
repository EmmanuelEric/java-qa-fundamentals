package com.ericthetester.lesson18.interfaces;

public class DatabaseCheck implements Testable {

    private String testName;
    private String dbName;

    public DatabaseCheck(String testName, String dbName) {

        this.testName = testName;
        this.dbName = dbName;

    }

    @Override
    public void execute() {

        System.out.println(testName + " is verifying connection to " + dbName);

    }
}

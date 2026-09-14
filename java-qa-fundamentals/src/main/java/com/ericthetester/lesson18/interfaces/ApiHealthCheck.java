package com.ericthetester.lesson18.interfaces;

public class ApiHealthCheck implements Testable, Reportable {

    private String testName;
    private String endpoint;

    public ApiHealthCheck(String testName, String endpoint) {

        this.testName = testName;
        this.endpoint = endpoint;

    }

    @Override
    public void execute() {

        System.out.println(testName + " is pinging " + endpoint);

    }

    @Override
    public void generateReport() {

        System.out.println(
                testName + " report: " + endpoint + " responded successfully."
        );

    }
}

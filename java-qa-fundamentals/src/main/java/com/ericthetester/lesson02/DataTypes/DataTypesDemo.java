package com.ericthetester.lesson02.DataTypes;

public class DataTypesDemo {
    public static void main(String[] args) {
        byte retryCount = 3;
        short totalTests = 120;
        int responseCode = 200;
        long transactionId = 1234567890123L;
        float cpuUsage = 72.5f;
        double responseTime = 1.38;
        char environment = 'Q';
        boolean testPassed = true;

        Integer age = 25;
        Double salary = 45000.75;
        Boolean automation = true;

        System.out.println("Retry Count       : " + retryCount);
        System.out.println("totalTests        : " + totalTests);
        System.out.println("responseCode      : " + responseCode);
        System.out.println("Transaction ID    : " + transactionId);
        System.out.println("CPU Usage         : " + cpuUsage);
        System.out.println("Response Time     : " + responseTime);
        System.out.println("Environment       : " + environment);
        System.out.println("Test Passed       : " + testPassed);
        System.out.println("Integer Age       : " + age);
        System.out.println("Double Salary     : " + salary);
        System.out.println("Boolean Automation:"  + automation);


        double score = 95.75;
        int wholeScore = (int) score;
        int number = 100;
        double convertedNumber = number;
        System.out.println("Original Score    : " + score);
        System.out.println("Whole Score       :" + wholeScore);
        System.out.println("Converted Number  : " + convertedNumber);
    }
}

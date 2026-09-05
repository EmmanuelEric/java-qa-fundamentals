package com.ericthetester.lesson11.oop;

public class TestCase {
     String testName;
    String testStatus;
    String browser;

    public TestCase(
            String testName,
            String testStatus,
            String browser
    ) {

        this.testName = testName;
        this.testStatus = testStatus;
        this.browser = browser;

    }

    public void displayTestCase() {

        System.out.println("Test Name: " + testName);
        System.out.println("Status: " + testStatus);
        System.out.println("Browser: " + browser);

    }
}

// validation with setters and getters would be:

// public class TestCase {

//     private String testName;
//     private String status;
//     private int responseCode;


//     public TestCase(
//             String testName,
//             String status,
//             int responseCode
//     ) {

//         this.testName = testName;
//         this.status = status;
//         this.responseCode = responseCode;

//     }


//     // Getters

//     public String getTestName() {

//         return testName;

//     }

//     public String getStatus() {

//         return status;

//     }

//     public int getResponseCode() {

//         return responseCode;

//     }


//     // Setters

//     public void setTestName(String testName) {

//         if (testName == null || testName.isEmpty()) {

//             System.out.println(
//                     "Test name cannot be empty."
//             );

//         } else {

//             this.testName = testName;

//         }
//     }


//     public void setStatus(String status) {

//         if (
//                 status.equalsIgnoreCase("Passed")
//                         ||
//                 status.equalsIgnoreCase("Failed")
//                         ||
//                 status.equalsIgnoreCase("Skipped")
//         ) {

//             this.status = status;

//         } else {

//             System.out.println(
//                     "Invalid test status."
//             );

//         }
//     }


//     public void setResponseCode(int responseCode) {

//         if (responseCode >= 100 && responseCode <= 599) {

//             this.responseCode = responseCode;

//         } else {

//             System.out.println(
//                     "Invalid HTTP response code."
//             );

//         }
//     }
// }

// Getters and Setters naming convention would be:
// private String name;
// getName() - Getter method for the name variable
// setName(String name) - Setter method for the name variable

// for private boolean active;
// isActive() - Getter method for the active variable
// setActive(boolean active) - Setter method for the active variable 

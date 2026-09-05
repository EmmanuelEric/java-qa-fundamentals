package com.ericthetester.lesson11.oop;

public class TestCaseDemo {
    public static void main(String[] args) {

        TestCase loginTest = new TestCase(
                "Login Test",
                "Passed",
                "Chrome"
        );

        TestCase registrationTest = new TestCase(
                "Registration Test",
                "Passed",
                "Firefox"
        );

        System.out.println("===== TEST CASE 1 =====");

        loginTest.displayTestCase();

        System.out.println();

        System.out.println("===== TEST CASE 2 =====");

        registrationTest.displayTestCase();
    }
}

// Testing Setters and Getters validation would be:

// public class TestCaseDemo {

//     public static void main(String[] args) {

//         TestCase loginTest = new TestCase(
//                 "Login API Test",
//                 "Passed",
//                 200
//         );


//         System.out.println(
//                 "Test: " + loginTest.getTestName()
//         );

//         System.out.println(
//                 "Status: " + loginTest.getStatus()
//         );

//         System.out.println(
//                 "Response Code: "
//                         + loginTest.getResponseCode()
//         );


//         System.out.println();

//         // Valid update

//         loginTest.setStatus("Failed");

//         System.out.println(
//                 "Updated Status: "
//                         + loginTest.getStatus()
//         );


//         // Invalid update

//         loginTest.setStatus("Unknown");

//     }
// }

// with encapsulation, setters checks the value before allowing the change. 
// If the value is not valid, it will not change the value and will print an error message.

package com.ericthetester.lesson11.oop;

public class InheritanceDemo {
    public static void main(String[] args) {

        Tester tester = new Tester(
                "Eric",
                "eric@email.com",
                "Selenium"
        );

        tester.displayUser();

        System.out.println();

        tester.runTest();
    }
}

// Using Multiple Child Classes:  

// public class InheritanceDemo {

//     public static void main(String[] args) {

//         Tester tester = new Tester(
//                 "Eric",
//                 "eric@email.com",
//                 "Selenium"
//         );

//         Admin admin = new Admin(
//                 "John",
//                 "john@email.com",
//                 "Administrator"
//         );


//         System.out.println("===== TESTER =====");

//         tester.displayUserInfo();
//         tester.runTest();


//         System.out.println();

//         System.out.println("===== ADMIN =====");

//         admin.displayUserInfo();
//         admin.manageUsers();
//     }
// }
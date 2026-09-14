package com.ericthetester.lesson15.inheritance;

public class InheritanceDemo {

    public static void main(String[] args) {

        Tester tester = new Tester(
                "Eric",
                "eric@email.com",
                "Selenium"
        );

        Admin admin = new Admin(
                "John",
                "john@email.com",
                "Administrator"
        );


        System.out.println("===== TESTER =====");

        tester.displayUserInfo();
        tester.runTest();


        System.out.println();

        System.out.println("===== ADMIN =====");

        admin.displayUserInfo();
        admin.manageUsers();
    }
}

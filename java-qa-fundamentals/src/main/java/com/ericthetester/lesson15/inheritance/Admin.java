package com.ericthetester.lesson15.inheritance;

public class Admin extends User {
    private String accessLevel;
// Another child class
    public Admin(
            String name,
            String email,
            String accessLevel
    ) {

        super(name, email);

        this.accessLevel = accessLevel;

    }

    public void manageUsers() {

        System.out.println(
                name + " is managing users."
        );

        System.out.println(
                "Access Level: " + accessLevel
        );
    }
}

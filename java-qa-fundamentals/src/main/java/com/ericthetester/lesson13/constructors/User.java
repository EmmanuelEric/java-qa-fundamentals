package com.ericthetester.lesson13.constructors;

public class User {
    private String name;
    private String role;
    private String location;
    private boolean active;

    public User() {
    }

    public User(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public void displayUser() {

        System.out.println("Name: " + name);
        System.out.println("Role: " + role);
        System.out.println("Location: " + location);
        System.out.println("Active: " + active);
    }
}

// Constructors are special methods in Java that are used to initialize objects.
// They have the same name as the class and do not have a return type.
//  Constructors can be overloaded, meaning you can have multiple constructors with different parameters.

// public class User {

//     String name;
//     String role;
//     String location;

//     // Default constructor
//     public User() {

//         name = "Unknown";
//         role = "Unknown";
//         location = "Unknown";

//     }

//     // Constructor with 2 parameters
//     public User(String name, String role) {

//         this.name = name;
//         this.role = role;
//         this.location = "Not Provided";

//     }

//     // Constructor with 3 parameters
//     public User(String name, String role, String location) {

//         this.name = name;
//         this.role = role;
//         this.location = location;

//     }

//     public void displayUser() {

//         System.out.println("Name: " + name);
//         System.out.println("Role: " + role);
//         System.out.println("Location: " + location);
//     }
// }

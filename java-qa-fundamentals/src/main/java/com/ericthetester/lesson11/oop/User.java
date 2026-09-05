package com.ericthetester.lesson11.oop;

public class User {
    protected String name;
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

// Encapsulation is a fundamental concept in object-oriented programming (OOP) that refers to the bundling of data (attributes) 
// and methods (functions) that operate on that data into a single unit, typically a class. It restricts direct access to some of an object's components, 
// which can prevent the accidental modification of data. This is usually achieved by making class variables private and providing public getter and 
// setter methods to access and modify those variables.

// Getters and setters are methods that allow you to access and modify the private variables of a class.

// public class User {

//     private String name;
//     private String role;
//     private String location;

//     public User(String name, String role, String location) {

//         this.name = name;
//         this.role = role;
//         this.location = location;

//     }

//     // Getters

//     public String getName() {

//         return name;

//     }

//     public String getRole() {

//         return role;

//     }

//     public String getLocation() {

//         return location;

//     }

//     // Setters

//     public void setName(String name) {

//         this.name = name;

//     }

//     public void setRole(String role) {

//         this.role = role;

//     }

//     public void setLocation(String location) {

//         this.location = location;

//     }
// }

// Inheritance is a fundamental concept in object-oriented programming (OOP) that allows a class to inherit properties 
// and behaviors (fields and methods) from another class.
// Parent class (superclass or baseclass): The class whose properties and methods are inherited by another class.
// Child class (subclass): The class that inherits properties and methods from the parent class.


// The parent Class

// public class User {

//     protected String name;
//     protected String email;

//     public User(String name, String email) {

//         this.name = name;
//         this.email = email;

//     }

//     public void displayUserInfo() {

//         System.out.println("Name: " + name);
//         System.out.println("Email: " + email);
//     }
// }
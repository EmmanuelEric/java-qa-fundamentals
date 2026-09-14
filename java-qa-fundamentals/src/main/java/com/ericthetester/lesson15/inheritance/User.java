package com.ericthetester.lesson15.inheritance;

// Inheritance is a fundamental concept in object-oriented programming (OOP) that allows a class to inherit properties
// and behaviors (fields and methods) from another class.
// Parent class (superclass or baseclass): The class whose properties and methods are inherited by another class.
// Child class (subclass): The class that inherits properties and methods from the parent class.

public class User {

    protected String name;
    protected String email;

    public User(String name, String email) {

        this.name = name;
        this.email = email;

    }

    public void displayUserInfo() {

        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
    }
}

package com.ericthetester.lesson11.oop;

public class CarDemo {

    public static void main(String[] args) {

        Car car1 = new Car();

        car1.brand = "Lexus";
        car1.model = "RX 500h";
        car1.year = 2025;


        Car car2 = new Car();

        car2.brand = "Lamborghini";
        car2.model = "Urus";
        car2.year = 2024;


        System.out.println("===== CAR 1 =====");

        car1.displayInfo();

        System.out.println();

        System.out.println("===== CAR 2 =====");

        car2.displayInfo();
    }
}
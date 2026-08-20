package com.ericthetester.lesson06;

// calling a method
public class MethodsDemo {
    public static void sayHello() {
        System.out.println("Hello Eric!");
    }

    public static void main(String[] args) {
        sayHello();
    }

    // void. Use when method performs an action.
   // public static void printWelcome() {
    //    System.out.println("Welcome!");
   // }

    // Return value. Use when the method calculates or retrieves something.
    // public static int square(int number) {
       // return number * number;
    // }
    // int result = square(5); result becomes 25.

    // Scope. It determines where a variable can be accessed.

    //public static void main(String[] args) {

     //   int age = 25;

      //  System.out.println(age);
   //}
    // age exist inside main.

    // Local variables

    // public static void calculate() {
    //    int number = 10;
    //}
    // Number only exist within calculate()
    // Parameters are also local to this method

    //public static void greet(String name) {
    //    System.out.println(name);
    //}
       // name belongs to greet(). You can't directly access it from another method.
    // You can have multiple methods with the same name provided their parameters are different.

    //public static int add(int a, int b, int c) {
    //    return a + b + c;
    //}
    // java can distinguish add(1,2); from add(1,2,3);

    // Different parameter types
    //public static int multiply(int a, int b) {
     //   return a * b;
    //}

    // and
   // public static double multiply(double a, double b) {
      //  return a * b;
   // }

    // Methods calling other methods

    //public static int calculateTotal(int price, int quantity) {
    //
    //    return price * quantity;
    //
    //}

    // we could then create

    //public static void printInvoice(int price, int quantity) {
    //
    //    int total = calculateTotal(price, quantity);
    //
    //    System.out.println("Total: " + total);
    //
    //}

    // and

    //public static void main(String[] args) {
    //
    //    printInvoice(500, 3);
    //
    //}
}

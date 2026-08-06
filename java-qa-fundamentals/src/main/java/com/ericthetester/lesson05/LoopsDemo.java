package com.ericthetester.lesson05;

public class LoopsDemo {
    public static void main(String[] args) {
        // for loop
        for(int i = 0; i <= 6; i++){
            System.out.println(i);
        }
        // int i=1; runs once.
        // is i <=5 ?, if true, continue. If false, stop.
        // increment: after every loop - i++;
        // which will give 1,2,3,4,5,6. When it reaches, 6
        // 6 is less than or equal to 5. Loop ends.

        // while loop
        int count = 7;
        while(count <= 15){
            System.out.println(count);
            // Without adding count++ it will keep looping
            count++;
        }
        // do...while loop
        int number = 21;
        do {
            System.out.println(number);
        } while(number < 16);
        // do...while loop always runs once before checking the conditions.

        //break
        for (int i = 1; i <= 10; i++){
            if(i == 5){
                break;
            }
            System.out.println(i);
            //It outputs 1,2,3,4. When i becomes 5 it breaks.
        }
        //continue
        for(int i= 1; i <=5; i++){
            if(i == 3){
                continue;
            }
            System.out.println(i);
            //The number 3 is skipped but the loop continues.
            //It outputs, 1,2,4,5.
        }
        //Nested loops
        for(int row = 1; row <=3; row++){
            for(int column = 1; column <=3; column++){
                System.out.println("Row: " + row + ", Column: " + column);
            }
            //Nested loops are often used when working with HTML tables.
        }
        // Enhanced for loop(For-Each)
        String[] browsers = {"Chrome", "Firefox", "Opera", "Edge", "Safari"};
        for(String browser : browsers){
            System.out.println(browser);
        }
        //This is iterating through collections of elements.
    }
}

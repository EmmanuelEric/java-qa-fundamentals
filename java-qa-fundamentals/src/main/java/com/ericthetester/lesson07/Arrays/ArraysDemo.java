package com.ericthetester.lesson07.Arrays;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        int[] scores = {85, 72, 90, 66, 78};
        System.out.println(scores[1]);
        // arrays starts counting index from 0 and not 1. So the output of 1 will be 72.

        // You can change an element.
        int[] marks = {85, 72, 90, 66, 78};
        marks[3] = 28;
        System.out.println(marks[3]);

        // array length
        int[] num = {85, 72, 90, 66, 78};
        System.out.println(num.length);
        // output = 5. Length is a property and not a method.

        // Looping through an array
        for(int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }

        // Array types
        // String
        String[] names = {"Ella", "Eric", "Favour"};

        // Double
        double[] prices = {10.5, 20.75, 30.99};

        // Boolean
        boolean[] results = {true, false, true};

        System.out.println(names[0]);
        System.out.println(prices[1]);
        System.out.println(results[2]);


        /*public class ArrayAnalysis {

          public static void main(String[] args) {
            int[] numbers = {12, 45, 7, 89, 23, 56, 34};

            int sum = calculateSum(numbers);
            double average = calculateAverage(sum, numbers.length);
            int highest = findHighest(numbers);
            int lowest = findLowest(numbers);

            System.out.println("===== ARRAY ANALYSIS =====");
            System.out.println("Numbers: " + Arrays.toString(numbers));
            System.out.println("Sum: " + sum);
            System.out.println("Average: " + average);
            System.out.println("Highest: " + highest);
            System.out.println("Lowest: " + lowest);

            System.out.println();

            printNumbersGreaterThan30(numbers);

            System.out.println();

            printEvenNumbers(numbers);
        }

        public static int calculateSum(int[] numbers) {

            int sum = 0;

            for (int number : numbers) {
                sum += number;
            }

            return sum;
        }

        public static double calculateAverage(int sum, int length) {

            return (double) sum / length;
        }

        public static int findHighest(int[] numbers) {

            int highest = numbers[0];

            for (int number : numbers) {

                if (number > highest) {
                    highest = number;
                }
            }

            return highest;
        }

        public static int findLowest(int[] numbers) {

            int lowest = numbers[0];

            for (int number : numbers) {

                if (number < lowest) {
                    lowest = number;
                }
            }

            return lowest;
        }

        public static void printNumbersGreaterThan30(int[] numbers) {

            System.out.println("Numbers greater than 30:");

            for (int number : numbers) {

                if (number > 30) {
                    System.out.println(number);
                }
            }
        }

        public static void printEvenNumbers(int[] numbers) {

            System.out.println("Even numbers:");

            for (int number : numbers) {

                if (number % 2 == 0) {
                    System.out.println(number);
                }
            }
        }
      }

      Result for the above:
      Numbers: [12, 45, 7, 89, 23, 56, 34]
        Sum: 266
        Average: 38.0
        Highest: 89
        Lowest: 7

        Numbers greater than 30:
        45
        89
        56
        34

        Even numbers:
        12
        56
        34
    }*/


        // Arrays.sort(). It sorts an array in ascending order.
        int[] numbers = {50, 10, 40, 20, 30};

        Arrays.sort(numbers);

        System.out.println(Arrays.toString(numbers));

        // Arrays.equals()
        int[] first = {10, 20, 30};
        int[] second = {10, 20, 30};
        System.out.println(Arrays.equals(first, second));
        // note that order matters here.

    }

}




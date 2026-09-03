package com.ericthetester.lesson01.Variables;

public class VariablesDemo {
    public static void main(String[] args) {
        String fullName = "Emmanuel Eric Agbiye";
        int age = 28;
        char gender = 'M';
        double accountBalance = 50000.50;
        boolean isLearningQA = true;
        char grade = 'A';
        long phoneNumber = 2348108076468000L;
        float examScore = 95.5f;
        byte yearsExperience = 2;
        short completedTests =  150;
        final String COUNTRY = "Nigeria";
        System.out.println("===== Student Profile ===== ");
        System.out.println("Full name is       : " + fullName);
        System.out.println("Age is             : " + age);
        System.out.println("Gender is          : " + gender);
        System.out.println("Account balance is : " + accountBalance);
        System.out.println("LearningQA         : " + isLearningQA);
        System.out.println("Country is         : " + COUNTRY);
        System.out.println("Phone Number is    : " + phoneNumber);
        System.out.println("Exam Score is      : " + examScore);
        System.out.println("Years Experience is: " + yearsExperience);
        System.out.println("Completed Tests is : " + completedTests);
        System.out.println("Grade is           : " + grade);
    }
}

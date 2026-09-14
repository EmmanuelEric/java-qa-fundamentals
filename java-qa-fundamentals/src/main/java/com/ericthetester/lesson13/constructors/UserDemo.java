package com.ericthetester.lesson13.constructors;

/*
public class UserDemo {

    public static void main(String[] args) {

        User user1 = new User();

        user1.name = "Eric";
        user1.role = "QA Automation Engineer";
        user1.location = "Lagos";
        user1.active = true;

        System.out.println("===== USER =====");

        user1.displayUser();
    }
}
*/

// Constructor would be:
  //  User user1 = new User(
     //               "Eric",
     //               "QA Automation Engineer"
     //       );

      //      user1.displayUser();

      // this: assigns the value of the parameter to the instance variable of the class.

      // this.name = name;
      // this.role = role;

public class UserDemo {

    public static void main(String[] args) {

        User user1 = new User(
                "Eric",
                "QA Automation Engineer"
        );

        User user2 = new User(
                "John",
                "Software Developer"
        );

        User user3 = new User(
                "Sarah",
                "QA Engineer"
        );

        user1.displayUser();

        System.out.println();

        user2.displayUser();

        System.out.println();

        user3.displayUser();
    }
}

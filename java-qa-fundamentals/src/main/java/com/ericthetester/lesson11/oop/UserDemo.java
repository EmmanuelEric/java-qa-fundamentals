package com.ericthetester.lesson11.oop;

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

// Using the Encapsulated class.

// public class UserDemo {

//     public static void main(String[] args) {

//         User user = new User(
//                 "Eric",
//                 "QA Automation Engineer",
//                 "Lagos"
//         );

//         System.out.println(
//                 "Name: " + user.getName()
//         );

//         System.out.println(
//                 "Role: " + user.getRole()
//         );

//         System.out.println(
//                 "Location: " + user.getLocation()
//         );


//         // Updating data

//         user.setRole(
//                 "Senior QA Automation Engineer"
//         );

//         System.out.println();

//         System.out.println(
//                 "Updated Role: " + user.getRole()
//         );
//     }
// }

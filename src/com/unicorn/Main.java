package com.unicorn;

import java.util.Scanner;
public class Main {

       /*
        Creating a GPA calculator
        -The GPA calculator accepts data in the form of:
            1.Name of User
            2. Course  Code
            3.Number of Credit hours
            4.The GPA gained for each course input.
        -The calculator then based on this information give,
        Calculates the GPA for the user.
         */

    public static void mainMenu() {
        System.out.println("<==========================================>");
        System.out.println("Try out your handy GPA calculator");
        System.out.println("<==========================================>");



        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter your name");
        String inputName = scanner.nextLine();



        System.out.println("Enter number of credits: ");
        int creditHours = scanner.nextInt();

        System.out.println("Enter names of Courses: ");
        String [] names = new String[5];
        names[0] = scanner.nextLine();
        names[1] = scanner.nextLine();
        names[2] = scanner.nextLine();
        names[3] = scanner.nextLine();
        names[4] = scanner.nextLine();


        System.out.println("Enter each course's grade respectively: ");
        double [] grades = new double[5];
        grades[0] = scanner.nextInt();
        grades[1] = scanner.nextInt();
        grades[2] = scanner.nextInt();
        grades[3] = scanner.nextInt();
        grades[4] = scanner.nextInt();


        System.out.println("Enter sum of gradepoints: ");
        double gradesSum = scanner.nextInt();


        System.out.println("Mr/Mrs " + inputName + " your total number of credits sum up to " + creditHours);
        System.out.println("<=============================================>");
        System.out.println("The course " + names[0] + " has a grade point of " + grades[0]);
        System.out.println("The course " + names[1]+ " has a grade point of " + grades[1]);
        System.out.println("The course " + names[2] + " has a grade point of " + grades[2]);
        System.out.println("The course " + names[3] + " has a grade point of " + grades[3]);
        System.out.println("The course " + names[4] + " has a grade point of " + grades[4]);
        System.out.println("<===============================================>");
        System.out.println("<===============================================>");

        System.out.println("Sum of grade points is: " + gradesSum);

        double finalgpa = gradesSum / creditHours;
        System.out.println("Your GPA is: "finalgpa);

    }

//    public static void calculateGpa() {
//        Scanner input = new Scanner(System.in);
//        System.out.println("hey");
//        double gpa = input.nextDouble();
//        double result = calculateTheGpa(gpa);
//    }
//
//    public static void calculateTheGpa(double gpa) {
//        double finalgpa =  ;
//    }


    public static void main(String[] args) {
	// write your code here
        mainMenu();
    }
}

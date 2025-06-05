package com.assignment;

import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


//      Input a year and find whether it is a leap year or not.

       System.out.println("Enter a Year");
       int year = input.nextInt();

       if (year % 4 == 0) {
           System.out.println(year + " is a leap year.");
       } else {
           System.out.println(year + " is not a leap year.");
       }






//      Take two numbers and print the sum of both.

       System.out.println("Enter number A: ");
       int numA = input.nextInt();
       System.out.println("Enter number B: ");
       int numB = input.nextInt();
       System.out.println("Sum of " + numA + " and " + numB + " is: " + (numA + numB));








//      Take a number as input and print the multiplication table for it.

       System.out.println("Enter a number whose table you want to print: ");
       int tNum = input.nextInt();
       for (int i = 1; i <= 10; i++) {
           System.out.println(tNum + " * " + i + " = " + tNum * i);
       }







//      Take 2 numbers as inputs and find their HCF
       System.out.println("Enter number a: ");
       int num1 = input.nextInt();
       System.out.println("Enter number b: ");
       int num2 = input.nextInt();
       int temp = 0;
       while (num2 != 0) {
           temp = num2;
           num2 = num1 % num2;
           num1 = temp;
       }
       System.out.println(num1);
    }
}

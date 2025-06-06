package com.assignments;

import java.util.Scanner;

public class Basic_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);



//      Write a program to print whether a number is even or odd, also take input from the user.

//        int n = input.nextInt();
//        if (n % 2 == 0) {
//            System.out.println("Even");
//        } else {
//            System.out.println("Odd");
//        }





//      Take name as input and print a greeting message for that particular name.

//        String name = input.next();
//        System.out.println("Hello " + name);





//      Take 2 numbers as input and print the largest number.
//        int a = input.nextInt();
//        int b = input.nextInt();
//
//        if (a > b) {
//            System.out.println(a + " is greater");
//        } else {
//            System.out.println(b + " is greater");
//        }





//      Input currency in rupees and output in USD.

//        int c = input.nextInt();
//        System.out.println(c / 85.79);





//      To calculate Fibonacci Series up to n numbers.
//        int a = 0;
//        int b = 1;
//        int x = input.nextInt();
//        for (int i = 0; i < x; i++) {
//            int temp = b;
//            b = a + b;
//            a = temp;
//        }
//        System.out.println(a);







//      Find out arm strong number.
        int num = input.nextInt();
        int res = 0;
        int temp = num;
        while (num > 0) {
            int rem = num % 10;
            int cube = 0;
            cube = rem * rem * rem;
            res = res + cube;
            num = num / 10;
        }
        if (res == temp) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }
    }
}

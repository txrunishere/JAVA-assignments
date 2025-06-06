package com.video_assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Video_Assignments {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


//      Find the Largest Number
//        int a = input.nextInt();
//        int b = input.nextInt();
//        int c = input.nextInt();


//      Solution - 1

//        if (a > b) {
//            if (a > c) {
//                System.out.println(a);
//            } else {
//                System.out.println(c);
//            }
//        } else {
//            if (b > c) {
//                System.out.println(b);
//            } else {
//                System.out.println(c);
//            }
//        }




//      Solution - 2

//        int max = a;
//        if (b > a) {
//            max = b;
//        }
//        if (c > a) {
//            max = c;
//        }
//        System.out.println(max);




//      Case Check

//        char x = input.next().trim().charAt(0);
//        if (x > 65 && x < 90) {
//            System.out.println("Upper Case " + x);
//        } else if (x > 97 && x < 122) {
//            System.out.println("Lower Case " + x);
//        }
//
//        if (x > 'a' && x < 'z') {
//            System.out.println("Lower Case " + x);
//        } else {
//            System.out.println("Upper Case " + x);
//        }






//      Fibonacci series
//        int a = 0;
//        int b = 1;
//        int n = input.nextInt();


//      With for loop
//        for (int i = 0; i < n; i++) {
//            int temp = b;
//            b = a + b;
//            a = temp;
//        }
//        System.out.println(a);


//      With while loop
//        int count = 0;
//        while (count < n) {
//            int temp = b;
//            b += a;
//            a = temp;
//            count++;
//        }
//        System.out.println(a);





//      Find Duplicate Number
//        long num = input.nextLong();
//        int x = input.nextInt();
//        int nCount = 0;
//
//        while (num > 0) {
//            int rem = (int)(num % 10);
//            if (rem == x) {
//                nCount++;
//            }
//            num = num / 10;
//        }
//        System.out.println(nCount);



//        int num = input.nextInt();
//        String rev = "";


        // First Approach
//        while (num > 0) {
//            int rem = num % 10;
//            rev = rev + rem;
//            num /= 10;
//        }
//        System.out.println(rev);





        // Second Approach
//
//        int x = 0;
//        while (num > 0) {
//            int rem = num % 10;
//            x = x * 10 + rem;
//            num /= 10;
//        }
//        System.out.println(x);






//      Basic Calculator Program
        int result = 0;
        while (true) {
            System.out.println("Enter a operation ('+', '-', '*', '/'): ");
            char op = input.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/') {
                int num1 = input.nextInt();
                int num2 = input.nextInt();
                if (op == '+') {
                    result = num1 + num2;
                } else if (op == '-') {
                    result = num1 - num2;
                } else if (op == '*') {
                    result = num1 * num2;
                } else {
                    result = num1 / num2;
                }
            } else if (op == 'x' || op == 'X') {
                break;
            } else {
                System.out.println("Invalid Operation");
            }
        }
        System.out.println(result);
    }
}

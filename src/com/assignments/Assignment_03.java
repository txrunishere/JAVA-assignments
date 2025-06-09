package com.assignments;

import java.util.Scanner;

public class Assignment_03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//      Area Of Circle Java Program
//        System.out.println("Enter Radius of Circle: ");
//        int r = in.nextInt();
//        System.out.println((Math.PI * (r * r)) + " cm2");






//      Area Of Triangle
//        System.out.println("Enter triangle's base");
//        int base = in.nextInt();
//        System.out.println("Enter triangle's height");
//        int h = in.nextInt();
//        System.out.println((0.5 * base * h) + " square units");





//      Area Of Rectangle Program
//        System.out.println("Enter Length of Rectangle: ");
//        int len = in.nextInt();
//        System.out.println("Enter Width of Triangle: ");
//        int wid = in.nextInt();
//        System.out.println((len * wid) + " km2");








//      Area Of Parallelogram
//        System.out.println("Enter Base of Parallelogram: ");
//        int base = in.nextInt();
//        System.out.println("Enter Height of Parallelogram: ");
//        int h = in.nextInt();
//        System.out.println((base * h) + " square units");








//      Area Of Rhombus
//        System.out.println("Enter two Diagonals of Rhombus: ");
//        int d1 = in.nextInt();
//        int d2 = in.nextInt();
//        System.out.println(((d1 * d2) / 2) + " m2");








//      Area Of Equilateral Triangle
//        System.out.println("Enter a side of Triangle: ");
//        int side = in.nextInt();
//        System.out.println((Math.sqrt(3) / 4) * side * side);







//      Circumference Of Circle
//        System.out.println("Enter Radius of Circle: ");
//        int radius = in.nextInt();
//        System.out.println((2 * Math.PI * radius) + " cm");






//      Perimeter Of Equilateral Triangle
//        System.out.println("Enter side of Triangle: ");
//        int side = in.nextInt();
//        System.out.println((3 * side) + " m");





//      Perimeter Of Parallelogram
//        System.out.println("Enter Base and Side of Parallelogram: ");
//        int base = in.nextInt();
//        int side = in.nextInt();
//        System.out.println((2 * (base + side)) + " units");







//      Perimeter Of Rectangle
//        System.out.println("Enter Length and Width of Rectangle: ");
//        int len = in.nextInt();
//        int wid = in.nextInt();
//        System.out.println(2 * (len + wid));







//      Perimeter Of Square
//        System.out.println("Enter a Side of Square: ");
//        int side = in.nextInt();
//        System.out.println(4 * side);







//      Perimeter Of Rhombus
//        System.out.println("Enter a Side of Rhombus: ");
//        int side = in.nextInt();
//        System.out.println(4 * side);








//      Volume Of Cone Java Program
//        System.out.println("Enter Radius and Height of Cone: ");
//        float rad = in.nextFloat();
//        float h = in.nextFloat();
//        System.out.println(Math.PI * (rad * rad) * (h / 3));






//      Volume Of Prism
//        System.out.println("Enter Base Side and Height of the Prism: ");
//        float base = in.nextFloat();
//        float h = in.nextFloat();
//        System.out.println(base * h);







//      Volume Of Cylinder
//        System.out.println("Enter Radius and Height of the Cylinder:");
//        double r = in.nextDouble();
//        double h = in.nextDouble();
//        System.out.println(Math.PI * (r * r) * h);







//      Volume Of Sphere
//        System.out.println("Enter the Radius of Sphere: ");
//        double r = in.nextDouble();
//        System.out.println((double) 4 / 3 * (Math.PI * (r * r * r)));






//      Volume Of Pyramid
//        System.out.println("Enter Length, Base and Height of Pyramid: ");
//        double l = in.nextDouble();
//        double base = in.nextDouble();
//        double h = in.nextDouble();
//        System.out.println((l * base * h) / 3);






//      Curved Surface Area Of Cylinder
//        System.out.println("Enter Radius and Height of the Cylinder: ");
//        double r = in.nextDouble();
//        double h = in.nextDouble();
//        System.out.println(2 * Math.PI * r * h);





//      Total Surface Area Of Cube
//        System.out.println("Enter side of cube: ");
//        double side = in.nextDouble();
//        System.out.println(6 * (side * side));





//      Fibonacci Series In Java Programs
//        int a = 0;
//        int b = 1;
//        int x = in.nextInt();
//        for (int i = 1; i < x; i++) {
//            int temp = b;
//            b = a + b;
//            a = temp;
//        }
//        System.out.println(a);





//      Input a number and print all the factors of that number (use loops).
//      PENDING






//      Take integer inputs till the user enters 0 and print the sum of all numbers
        int sum = 0;
        while (true) {
            int num = in.nextInt();
            if (num == 0) {
                System.out.println(sum);
                break;
            }
            sum += num;
        }






//      Take integer inputs till the user enters 0 and print the largest number from all.
        int lar = 0;
        while (true) {
            int num = in.nextInt();

            if (num == 0) {
                System.out.println(lar);
                break;
            }

            if (num > lar) {
                lar = num;
            }
        }
    }
}

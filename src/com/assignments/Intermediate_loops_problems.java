package com.assignments;

import java.util.Scanner;

public class Intermediate_loops_problems {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        int factorialRet = factorialVal(in.nextInt());
//        System.out.println(factorialRet);


//        System.out.println("Enter watt of appliance: ");
//        int w = in.nextInt();
//        System.out.println("Enter quantity of that appliance: ");
//        int q = in.nextInt();
//        System.out.println("Enter time appliance use (in hours): ");
//        int h = in.nextInt();
//        int billRes = calculateBill(w, q, h);
//        System.out.println(billRes + " watt");



//        double avg = numsAverage(in.nextInt());
//        System.out.println(avg);



//        double discountValue = discount(in.nextInt());
//        System.out.println(discountValue);




    }


    // Factorial Program In Java
    static int factorialVal(int range) {
        if (range == 0 || range == 1) {
            return 1;
        }
        int res = 1;
        for (int i = 2; i <= range; i++) {
            res = res * i;
        }
        return res;
    }



    // Calculate Electricity Bill
    /**
     * To calculate electricity bill firstly we need
     * appliance, watt it consumes, quantity of that appliance, and how much time it runs
    */
    static int calculateBill(int watt, int quantity, int time) {
        int res = watt * quantity * time;
        return res;
    }


    // Calculate Average Of N Numbers
    static double numsAverage(int num) {
        double res = 0;
        for (int i = 1; i <= num; i++) {
            res += i;
        }
        return res / num;
    }


    // Calculate Discount Of Product
    static double discount(double price) {
        double finalPrice;
        if (price >= 5000 && price < 10000) {
            finalPrice = price * 0.10; // 10% discount
        } else if (price >= 10000 && price < 20000) {
            finalPrice = price * 0.20; // 20% discount
        } else if (price >= 20000) {
            finalPrice = price * 0.35; // 35% discount
        } else {
            finalPrice = price * 0.05; // 5% discount
        }
        return price - finalPrice;
    }
}

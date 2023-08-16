package com.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("\nEB BILL CALCULATOR ");
        System.out.println("\nEnter your units of current used : ");

        int units = s.nextInt();

        System.out.format("\nBill Amount : %.1f\n" , Calculations.segregate(units));
        
        s.close();
    }
}

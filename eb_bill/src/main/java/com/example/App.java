package com.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int units = s.nextInt();

        System.out.println( Calculations.segregate(units) );
        
        s.close();
    }
}

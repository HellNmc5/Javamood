package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Fraction fraction1 = new Fraction( 3, 5);
        Fraction fraction2= new Fraction();
        fraction2 = fraction1.MoveXY(-25);
        System.out.println(fraction2);
        fraction2= fraction2.MoveXandY(5);
        System.out.println(fraction2);
    }
}

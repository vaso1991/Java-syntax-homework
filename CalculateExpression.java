package com.company;

import java.util.Scanner;

public class CalculateExpression {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Double a = read.nextDouble();
        Double b = read.nextDouble();
        Double c = read.nextDouble();
        Double f11 = (Math.pow(a,2) + Math.pow(b,2))/((Math.pow(a,2) - Math.pow(b,2)));
        Double pow = (a + b + c) / Math.sqrt(c);
        Double resultF1= Math.pow(f11,pow);
        Double f2 = Math.pow(a,2) + Math.pow(b,2) - Math.pow(c,3);
        Double f2Pow = a - b;
        Double resultF2= Math.pow(f2,f2Pow);
        Double averageAbc = (a + b + c) /3;
        Double averageF12 = (resultF1 + resultF2)/2;
        Double differance = averageAbc - averageF12;
        if (differance < 0) {
            differance *=-1;
        }
        System.out.printf("F1 result: %.2f; F2 result: %.2f; Diff: %.2f",resultF1,resultF2,differance);


    }
}

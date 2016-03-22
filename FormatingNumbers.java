package com.company;

import java.util.Scanner;

public class FormatingNumbers {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int numa = read.nextInt();
        int numaBinary = Integer.parseInt(Integer.toBinaryString(numa));
        double numb = read.nextDouble();
        double numc = read.nextDouble();
        System.out.printf("|%-10X|%010d|%10.2f|%-10.3f|", numa, numaBinary, numb, numc);
    }
}

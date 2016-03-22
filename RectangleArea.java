package com.company;

import java.util.Scanner;

public class RectangleArea {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int a = read.nextInt();
        int b = read.nextInt();
        int area = a*b;
        System.out.println(area);
    }
}

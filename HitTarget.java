package com.company;

import java.util.Scanner;

public class HitTarget {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Integer target = read.nextInt();
        for (int i = 1; i <= 20; i++) {
            for (int j = 1; j <= 20; j++) {
                if (i + j == target) {
                    System.out.println(i + "+" + j + "=" + target);
                }
            }
        }
        System.out.println("...");
        for (int i = 1; i <=20 ; i++) {
            for (int j = 1; j <=20 ; j++) {
                if (i - j == target ) {
                    System.out.println(i + "-" + j + "=" + target);
                }
            }
        }
    }
}

package com.company;

import java.util.Scanner;

public class Base7ToDecimal {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String num7 = read.nextLine();
        Double result = 0D;
        Integer count = 0;
        int[]digits = new int[num7.length()];
        for (int i = 0; i < num7.length(); i++)
        {
            digits[i] = num7.charAt(i) - '0';
        }
        for (int i = num7.length() -1; i >=0 ; i--) {
            result += digits[count] * Math.pow(7,i);
            count ++;
        }
        System.out.print(result);
    }
}

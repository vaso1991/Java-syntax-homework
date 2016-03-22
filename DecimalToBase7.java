package com.company;

import java.util.Scanner;

public class DecimalToBase7 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Integer num = read.nextInt();
        String reverseResult = "";
        while (num != 0) {
            reverseResult += num % 7;
            num = num / 7;
        }
        String result = new StringBuffer(reverseResult).reverse().toString();
        System.out.print(result);

    }
}

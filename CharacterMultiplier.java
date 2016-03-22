package com.company;

import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String[] input = read.nextLine().split("\\s+");
        String a = input[0];
        String b = input[1];
        System.out.println(stringMultiplier(a,b));
    }
    public static Long stringMultiplier (String a , String b) {
        Long result = 0L;
        if (a.length() > b.length()) {
            for (int i = 0; i <b.length() ; i++) {
                result += a.charAt(i) * b.charAt(i);
            }
            for (int i = b.length(); i <a.length() ; i++) {
                result += a.charAt(i);
            }
        } else if (a.length() == b.length()) {
            for (int i = 0; i <a.length() ; i++) {
                result += a.charAt(i) * b.charAt(i);
            }
        } else if (a.length() < b.length()) {
            for (int i = 0; i <a.length(); i++) {
                result += a.charAt(i) * b.charAt(i);
            }
            for (int i = a.length(); i <b.length() ; i++) {
                result +=b.charAt(i);
            }

        }
        return result;
    }
}

package com.company;
import java.util.Scanner;
public class OddAndEvenPairs {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String input = read.nextLine();
        String[] nums = input.split("\\s+");
        if (nums.length % 2 == 0 ){
            for (int i = 0; i <nums.length ; i+=2) {
                Integer first = Integer.parseInt(nums[i]);
                Integer second = Integer.parseInt(nums[i+1]);
                if (first % 2 == 0 && second % 2 == 0) {
                    System.out.println(first + " ," + second + "-> both are even");
                } else if (first % 2 != 0 && second % 2 != 0) {
                    System.out.println(first + " ," + second + "-> both are odd");
                } else {
                    System.out.println(first + " ," + second + "-> different");
                }
            }
        } else {
            System.out.println("Invalid length");
        }
    }
}

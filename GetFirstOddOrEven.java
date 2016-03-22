package com.company;


import java.util.Scanner;

public class GetFirstOddOrEven {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String numbers = read.nextLine();
        String[] nums = numbers.split("\\s+");
        String input = read.nextLine();
        String[] commands = input.split("\\s+");
        String oddOrNot = commands[2];
        Integer needed = Integer.parseInt(commands[1]);
        Integer count = 0;
        if (oddOrNot.charAt(0) == 'o' ) {
            for (int i = 0; i <nums.length ; i++) {
                if (count == needed) {
                    break;
                }
                Integer num = Integer.parseInt(nums[i]);
                if (num % 2 !=0) {
                    System.out.print(num + " ");
                    count++;
                }
            }
        } else if (oddOrNot.charAt(0) == 'e') {
            for (int i = 0; i <nums.length ; i++) {
                if (count == needed) {
                    break;
                }
                Integer num = Integer.parseInt(nums[i]);
                if (num % 2 ==0) {
                    System.out.print(num + " ");
                    count++;
                }
            }

        }
        System.out.println();
    }
}

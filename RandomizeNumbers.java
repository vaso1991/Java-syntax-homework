package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RandomizeNumbers {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String[] input = read.nextLine().split("\\s+");
        Integer a = Integer.parseInt(input[0]);
        Integer b = Integer.parseInt(input[1]);
        Random rnGesus = new Random();
        List<Integer> nums = new ArrayList<>();
        if (a == b) {
            System.out.println(a);
            return;
        } else if (a > b) {
            for (int i = b; i <=a ; i++) {
                nums.add(i);
            }
            for (int i = 0; i <1000 ; i++) {
                int rng = rnGesus.nextInt(nums.size());
                int temp = nums.get(rng);
                nums.remove(rng);
                nums.add(temp);
            }
        } else if (b > a) {
            for (int i = a; i <=b ; i++) {
                nums.add(i);
            }
            for (int i = 0; i <1000 ; i++) {
                int rng = rnGesus.nextInt(nums.size());
                int temp = nums.get(rng);
                nums.remove(rng);
                nums.add(temp);
            }
        }
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}

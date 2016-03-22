package com.company;
import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String inputA = read.nextLine();
        String[] a = inputA.split("\\s+");
        Double ax = Double.parseDouble(a[0]);
        Double ay = Double.parseDouble(a[1]);
        String inputB = read.nextLine();
        String[] b = inputB.split("\\s+");
        Double bx = Double.parseDouble(b[0]);
        Double by = Double.parseDouble(b[1]);
        String inputC = read.nextLine();
        String[] c = inputC.split("\\s+");
        Double cx = Double.parseDouble(c[0]);
        Double cy = Double.parseDouble(c[1]);
        Double area = (ax * (by - cy) + bx * (cy - ay) + cx * (ay - by)) / 2d;
        System.out.print(area);
    }
}
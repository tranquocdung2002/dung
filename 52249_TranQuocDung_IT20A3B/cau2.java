package com.company;

import java.util.Scanner;

public class cau2 {
    public static void main(String[] args) {
        System.out.println("nhap a");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("nhap b");
        int b = sc.nextInt();
        System.out.println("nhap c");
        int c = sc.nextInt();
        if (a > b && a > c) {
            System.out.println("so lon nhat la a");
        }
        else if (b > a && b > c) {
            System.out.println("so lon nhat la b");
        }
        else {
            System.out.println("so lon nhat la c");
        }
    }
}

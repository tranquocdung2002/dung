package com.company;

import java.util.Scanner;

public class cau3 {
    public static void main(String[] args) {
        System.out.println("nhap a");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("nhap b");
        int b = sc.nextInt();
        int x = -b / a;
        System.out.println("ket qua la: " + x);
    }
}

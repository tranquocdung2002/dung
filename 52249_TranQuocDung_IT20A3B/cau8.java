package com.company;

import java.util.Scanner;

public class cau8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap a");
        int a = sc.nextInt();
        System.out.println("nhap b");
        int b = sc.nextInt();
        while (a != b)
        {
            if(a > b)
                a = a - b;
            else
                b = b - a;
        }
        System.out.println("uoc chung lon nhat la " + b);
    }
}


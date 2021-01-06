package com.company;

import java.util.Scanner;

public class cau6 {
    public static void main(String[] args) {
        System.out.println("nhap a");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("nhap b");
        int b = sc.nextInt();
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("sau khi swap a = " + a);
        System.out.println("sau khi swap b = " + b);

    }
}

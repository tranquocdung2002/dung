package com.company;

import java.util.Scanner;

public class cau7 {
    public static void main(String[] args) {
        System.out.println("nhap a");
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int a = (int) Math.sqrt(b);
        if (a * a == b) {
            System.out.println("a la so chinh phuong");
        }
        else {
            System.out.println("a k phai la so chinh phuong");
        }
    }
}

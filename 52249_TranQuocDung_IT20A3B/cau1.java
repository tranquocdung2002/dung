package com.company;

import java.util.Scanner;

public class cau1 {
    public static void main(String[] args) {
        System.out.println("nhap");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a % 2 == 0) {
            System.out.println("a la so chan");
        }
        else {
            System.out.println("a la so le");
        }
    }
}

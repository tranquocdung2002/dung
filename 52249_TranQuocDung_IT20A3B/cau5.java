package com.company;

import java.util.Scanner;

public class cau5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so a");
        int a = sc.nextInt();

        if (a < 2){
            System.out.println("a khong phai la so nguyen to");
        }
        else if(a == 2){
            System.out.println("a la so nguyen to");
        }
        else if(a % 2 == 0) {
            System.out.println("a khong phai la so nguyen to");
        }
        for (int i = 3; i < (a - 1); i += 2) {
            if (a % i == 0) {
                System.out.println("a khong phai la so nguyen to"); }
            else {
                System.out.println("a la so nguyen to");
            }
        }
    }
}

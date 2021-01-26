package com.company;

import java.util.Scanner;

public class cau2 {

    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhập độ dài cho mảng : ");
        int n = nhap.nextInt();
        int a[] = new int[n];
        //1
        System.out.println("Nhập giá trị cho mảng a : ");
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] : ");
            a[i] = nhap.nextInt();
        }
        System.out.print("Mảng vừa nhập  : ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        ///3
        int s = 0;
        for (int i = 0; i < n; i++) {
            s = a[0] + a[n - 1];

        }
        System.out.println("tổng phần tử đầu tiên và cuối cùng của mảng là: " + s);
        System.out.println();
        //2
        /// giam dan thi doi ngoac o if
        int temp;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.print("Kết quả sau khi được sắp xếp mảng theo thứ tự tăng dần: ");
        for (int j = 0; j < n - 1; j++) {
            System.out.print(a[j] + ", ");
        }
        System.out.print(a[n - 1]);
        System.out.println();
        int dem = 0;
        float tbc = 0;
        float tong = 0;
        for (int i = 0; i < n; i++) {
            tong = tong + a[i];
            tbc = tong / n;
        }
        for (int i = 0; i < n; i++) {
            if (a[i] >= tbc) {
                dem++;
            }
        }
        System.out.println("Số phần tử có giá trị lớn hơn hoặc bằng giá trị trung bình của mảng là: " + dem);
        System.out.println();
        int chan[] = new int[n];
        int c = 0, d = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                chan[c] = a[i];
                c++;
            }
        }
        System.out.println("Các phần tử chẵn là: ");
        for (int i = 0; i < c; i++) {
            System.out.print(chan[i] + " ");
        }
    }
}






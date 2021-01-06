package com.company;

import java.util.Scanner;

public class cau10 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhap do dai cho mang : ");
        int n = nhap.nextInt();
        int a[] = new int[n];
        //1
        System.out.println("Nhap du lieu cho mang : ");
        for (int i = 0; i < n; i++) {
            System.out.print("a["+i+"] : ");
            a[i] = nhap.nextInt();
        }
        System.out.print("Mang vua nhap la : ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        //2
        int dem2=0;
        for (int i = 0; i < n; i++) {
            if(a[i]%5==0&&a[i]%6!=0){
                dem2=dem2+1;
            }
        }
        System.out.print("Co "+dem2+" gia tri chia het cho 5 ma khong chia het cho 6");
        System.out.println();
        //3
        int dem = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0){
              dem++;
            }
        }
        System.out.print("so gia tri le trong mang la: "+ dem);
        System.out.println();

        //6
        int chan[] = new int[n];
        int le [] = new int[n];
        int c=0,d=0;
        for (int i = 0; i < n; i++) {
            if(a[i]%2!=0){
                le[c]=a[i];
                c++;
            }else{
                chan[d]=a[i];
                d++;
            }
        }
        System.out.println("Cac phan tu cua mang chan la : ");
        for (int i = 0; i < c; i++) {
            System.out.print(chan[i] + " ");
        }

        System.out.println("Cac phan tu cua mang le la : ");
        for (int i = 0; i < d; i++) {
            System.out.print(le[i] + " ");
        }
    }
}


package com.company;

import java.util.Scanner;

public class cau9 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhap do dai cho mang : ");
        int n = nhap.nextInt();
        int a[] = new int[n];
        //1
        System.out.println("Nhap gia tri cho mang a : ");
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
            if(a[i]%3==0&&a[i]%2!=0){
                dem2=dem2+1;
            }
        }
        System.out.print("Co "+dem2+" gia tri chia het cho 3 ma khong chia het cho 2");
        System.out.println();
        //3
        int max = a[1];
        for (int i = 0; i < n; i++) {
            if(max<a[i]){
                max = a[i];
            }
        }
        System.out.print("Gia tri lon nhat trong mang la : "+max);
        System.out.println();
        //4
        System.out.print("Nhap gia tri X : ");
        int x = nhap.nextInt();
        int dem4 = 0;
        for (int i = 0; i < n; i++) {
            if(a[i]==x){
                dem4=dem4+1;
            }
        }
        if(dem4==0){
            System.out.print("Gia tri X khong co trong mang !");
        }else{
            System.out.print("Gia tri X co trong mang !");
        }
        System.out.println();
        //5
        int dem5=0;
        for (int i = 0; i < n; i++) {
            if(a[i]%2==0){
                dem5=dem5+1;
            }
        }
        System.out.print("Co "+dem5+" gia tri chan trong mang !");
        System.out.println();
        //6
        int chan[] = new int[n];
        int le [] = new int[n];
        int c=0,d=0;
        for (int i = 0; i < n; i++) {
            if(a[i]%2==0){
                chan[c]=a[i];
                c++;
            }else{
                le[d]=a[i];
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



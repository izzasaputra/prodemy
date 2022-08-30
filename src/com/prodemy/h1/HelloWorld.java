package com.prodemy.h1;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nama anda:");
        String nama = sc.nextLine();
        System.out.print("Hello "+ nama);
    }
}

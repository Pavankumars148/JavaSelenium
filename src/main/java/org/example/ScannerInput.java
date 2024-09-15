package org.example;

import java.util.Scanner;

public class ScannerInput {
    public static int scannerInt(){
        System.out.println("Please enter integer value");
        Scanner sc=new Scanner(System.in);
        return sc.nextInt();
    }
    public static String scannerString(){
        System.out.println("Please enter integer value");
        Scanner sc=new Scanner(System.in);
        return sc.next();
    }
}

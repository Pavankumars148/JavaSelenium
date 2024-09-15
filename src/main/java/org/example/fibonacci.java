package org.example;

import java.util.Scanner;

import static org.example.ScannerInput.scannerInt;

public class fibonacci {
    public static void main(String[] args) {
        checkFibonacciUsingForLoop(scannerInt());
        checkFibonacciUsingWhileLoop(scannerInt());
    }

    public static void checkFibonacciUsingForLoop(int sequence) {
        int i = 0;
        int j = 1;
        int temp;
        for (int k = 0; k <= sequence; k++) {
            System.out.print(i +" ");
            temp=i+j;
            i=j;
            j=temp;
        }
    }
    public static void checkFibonacciUsingWhileLoop(int sequence) {
        int i = 0;
        int j = 1;
        int temp;
        while (i<sequence) {
            System.out.print(i +" ");
            temp=i+j;
            i=j;
            j=temp;
        }
    }
}

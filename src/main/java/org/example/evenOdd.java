package org.example;

import java.util.Scanner;

public class evenOdd {

    public static void main(String[] args) {
        System.out.println("Enter a number");
        try {
            Scanner sc= new Scanner(System.in);
            int i= sc.nextInt();
            checkEvenOrOdd(i);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void checkEvenOrOdd(int i) {
        try {
            if (i == 0||i<0) {
                System.out.println("Given number " + i + " is not even or odd");
            } else {
                if (i % 2 == 0) {
                    System.out.println("Given number " + i + " even");
                } else {
                    System.out.println("Given number " + i + " odd");
                    System.out.println("Given number " + i + " odd");
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
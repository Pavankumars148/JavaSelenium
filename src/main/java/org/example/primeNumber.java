package org.example;

import java.util.Scanner;

public class primeNumber {
    public static int i;
    public static boolean flag;

    public static void main(String[] args) {
        try {
            System.out.println("Please enter the number");
            Scanner sc = new Scanner(System.in);
            i = sc.nextInt();
            checkPrimeNumber();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void checkPrimeNumber() {
        if (i <= 1) {
            System.out.println("Given number is not a prime number");
        } else {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = true;
                    break;
                }
            }
            if (flag)
                System.out.println("Given number is not a prime number " + i);
            else
                System.out.println("Given number is a prime number " + i);
        }
    }
}

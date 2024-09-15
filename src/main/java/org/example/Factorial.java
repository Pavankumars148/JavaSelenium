package org.example;

public class Factorial {
    public static void main(String[] args) {
        factorial(5);
    }

    public static void factorial(int num) {
       int fact=1;//6
       while (num>1){
           num=num-1;//5,4,3,2,1
           fact*=num;//30,120,360,720
       }
        System.out.println(fact);
    }
}

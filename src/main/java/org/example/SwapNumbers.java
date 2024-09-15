package org.example;

public class SwapNumbers {
    static SwapNumbers SN;

    public static void main(String[] args) {
        SN = new SwapNumbers();
        SN.swapUsingThirdVariable();
        if (SN == null) {
            SN = new SwapNumbers();
            SN.swapWithoutThirdVariable();
        } else {
            SN.swapWithoutThirdVariable();
        }

    }

    int a = 10;//30
    int b = 20;
    int temp;

    void swapWithoutThirdVariable() {
        System.out.println("before swapping value of a=" + a + " and b=" + b);
        a = a + b;//a=30
        b = a - b;//b=10
        a = a - b;//20
        System.out.println("after swapping value of a=" + a + " and b=" + b);
    }

    void swapUsingThirdVariable() {
        System.out.println("before swapping value of a=" + a + " and b=" + b);
        temp = a;
        a = b;
        b = temp;
        System.out.println(SN.a);
        System.out.println("after swapping value of a=" + a + " and b=" + b);
    }
}

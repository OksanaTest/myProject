package com.examplesShildt.exceptions;
/*
p.271
 */
public class MethNestTry {
    static void nessttry(int a) {
        try {
            if (a == 1) a = a/(a - a);
            if (a == 2) {
                int c[] = {1};
                c[42] = 99;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("exception related to array index");
        }
    }

    public static void main(String[] args) {
        try {
            int a = args.length;
            int b = 42/a;
            System.out.println("a = " + a);
            nessttry(a);
        } catch (ArithmeticException e) {
            System.out.println("division by zero: " + e);
        }
    }
}

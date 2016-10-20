package com.examplesShildt.exceptions;

import java.util.Random;

/*
p.267
 */
public class HandleError {
    public static void main(String[] args) {
        int a = 0, b = 0, c = 0;
        Random random = new Random();
        for (int i = 0; i < 32000; i++){
            try{
                b = random.nextInt();
                c = random.nextInt();
                a = 12345/(b/c);
            } catch (ArithmeticException e) {
                System.out.println("division by zero");
                a = 0;
            }
            System.out.println("a: " + a);
        }
    }
}

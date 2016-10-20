package com.examplesShildt.exceptions;
/*
p.266
 */
public class TryCatchArithmeticException {
    public static void main(String[] args) {
        int a,b;
        try{
            b = 0;
            a = 42/b;//after this line -> catch
            System.out.println("This message will not be displayed");
        } catch (ArithmeticException e){
            System.out.println("division by zero");
        }
        System.out.println("after catch");
    }
}

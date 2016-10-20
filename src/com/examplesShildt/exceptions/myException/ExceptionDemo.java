package com.examplesShildt.exceptions.myException;
/*
p.281
 */
public class ExceptionDemo {
    static void compute(int a) throws MyException {
        System.out.println("method compute(" + a + ") is calling");
        if (a > 10) throw new MyException(a);
        System.out.println("expected finish");
    }

    public static void main(String[] args) {
        try{
            compute(1);
            compute(20);
        } catch (MyException e) {
            System.out.println("exception " + e + " have been caught");
        }
    }
}

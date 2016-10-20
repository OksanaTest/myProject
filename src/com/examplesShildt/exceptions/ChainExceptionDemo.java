package com.examplesShildt.exceptions;
/*
p.280
 */
public class ChainExceptionDemo {
    static void demoproc() {
        NullPointerException e =
                new NullPointerException("high level");
        //add exception root cause
        e.initCause(new ArithmeticException("root cause"));
        throw e;
    }

    public static void main(String[] args) {
        try{
            demoproc();
        } catch (NullPointerException e) {
            System.out.println("exception " + e + " have been caught");
            System.out.println("root cause: " + e.getCause());
        }
    }
}

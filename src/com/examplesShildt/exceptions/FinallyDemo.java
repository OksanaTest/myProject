package com.examplesShildt.exceptions;
/*
p.275
 */
public class FinallyDemo {
    static void procA() {
        try{
            System.out.println("in the method procA()");
            throw new RuntimeException("demonstration");
        } finally {
            System.out.println("finally block in the method procA()");
        }
    }
    static void procB() {
        try{
            System.out.println("in the method procB()");
            return;
        } finally {
            System.out.println("finally block in the method procB()");
        }
    }
    static void procC() {
        try{
            System.out.println("in the method procC()");
        } finally {
            System.out.println("finally block in the method procC()");
        }
    }

    public static void main(String[] args) {
        try{
            procA();
        } catch (Exception e) {
            System.out.println("exception has been caught");
        }
        procB();
        procC();
    }
}
